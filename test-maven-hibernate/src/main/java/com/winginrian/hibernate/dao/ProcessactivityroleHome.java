package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processactivityrole;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processactivityrole.
 * @see com.winginrian.hibernate.dao.Processactivityrole
 * @author Hibernate Tools
 */
public class ProcessactivityroleHome {

	private static final Log log = LogFactory.getLog(ProcessactivityroleHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processactivityrole transientInstance) {
		log.debug("persisting Processactivityrole instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processactivityrole instance) {
		log.debug("attaching dirty Processactivityrole instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processactivityrole instance) {
		log.debug("attaching clean Processactivityrole instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processactivityrole persistentInstance) {
		log.debug("deleting Processactivityrole instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processactivityrole merge(Processactivityrole detachedInstance) {
		log.debug("merging Processactivityrole instance");
		try {
			Processactivityrole result = (Processactivityrole) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processactivityrole findById(java.lang.Integer id) {
		log.debug("getting Processactivityrole instance with id: " + id);
		try {
			Processactivityrole instance = (Processactivityrole) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processactivityrole", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Processactivityrole> findByExample(Processactivityrole instance) {
		log.debug("finding Processactivityrole instance by example");
		try {
			List<Processactivityrole> results = (List<Processactivityrole>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processactivityrole").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
