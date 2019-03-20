package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processactivityresource;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processactivityresource.
 * @see com.winginrian.hibernate.dao.Processactivityresource
 * @author Hibernate Tools
 */
public class ProcessactivityresourceHome {

	private static final Log log = LogFactory.getLog(ProcessactivityresourceHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processactivityresource transientInstance) {
		log.debug("persisting Processactivityresource instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processactivityresource instance) {
		log.debug("attaching dirty Processactivityresource instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processactivityresource instance) {
		log.debug("attaching clean Processactivityresource instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processactivityresource persistentInstance) {
		log.debug("deleting Processactivityresource instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processactivityresource merge(Processactivityresource detachedInstance) {
		log.debug("merging Processactivityresource instance");
		try {
			Processactivityresource result = (Processactivityresource) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processactivityresource findById(java.lang.Integer id) {
		log.debug("getting Processactivityresource instance with id: " + id);
		try {
			Processactivityresource instance = (Processactivityresource) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processactivityresource", id);
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

	public List<Processactivityresource> findByExample(Processactivityresource instance) {
		log.debug("finding Processactivityresource instance by example");
		try {
			List<Processactivityresource> results = (List<Processactivityresource>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processactivityresource").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
