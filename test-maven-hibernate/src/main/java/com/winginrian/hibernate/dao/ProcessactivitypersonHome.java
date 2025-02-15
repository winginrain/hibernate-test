package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processactivityperson;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processactivityperson.
 * @see com.winginrian.hibernate.dao.Processactivityperson
 * @author Hibernate Tools
 */
public class ProcessactivitypersonHome {

	private static final Log log = LogFactory.getLog(ProcessactivitypersonHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processactivityperson transientInstance) {
		log.debug("persisting Processactivityperson instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processactivityperson instance) {
		log.debug("attaching dirty Processactivityperson instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processactivityperson instance) {
		log.debug("attaching clean Processactivityperson instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processactivityperson persistentInstance) {
		log.debug("deleting Processactivityperson instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processactivityperson merge(Processactivityperson detachedInstance) {
		log.debug("merging Processactivityperson instance");
		try {
			Processactivityperson result = (Processactivityperson) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processactivityperson findById(java.lang.Integer id) {
		log.debug("getting Processactivityperson instance with id: " + id);
		try {
			Processactivityperson instance = (Processactivityperson) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processactivityperson", id);
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

	public List<Processactivityperson> findByExample(Processactivityperson instance) {
		log.debug("finding Processactivityperson instance by example");
		try {
			List<Processactivityperson> results = (List<Processactivityperson>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processactivityperson").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
