package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processcustomapplication;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processcustomapplication.
 * @see com.winginrian.hibernate.dao.Processcustomapplication
 * @author Hibernate Tools
 */
public class ProcesscustomapplicationHome {

	private static final Log log = LogFactory.getLog(ProcesscustomapplicationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processcustomapplication transientInstance) {
		log.debug("persisting Processcustomapplication instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processcustomapplication instance) {
		log.debug("attaching dirty Processcustomapplication instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processcustomapplication instance) {
		log.debug("attaching clean Processcustomapplication instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processcustomapplication persistentInstance) {
		log.debug("deleting Processcustomapplication instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processcustomapplication merge(Processcustomapplication detachedInstance) {
		log.debug("merging Processcustomapplication instance");
		try {
			Processcustomapplication result = (Processcustomapplication) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processcustomapplication findById(java.lang.Integer id) {
		log.debug("getting Processcustomapplication instance with id: " + id);
		try {
			Processcustomapplication instance = (Processcustomapplication) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processcustomapplication", id);
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

	public List<Processcustomapplication> findByExample(Processcustomapplication instance) {
		log.debug("finding Processcustomapplication instance by example");
		try {
			List<Processcustomapplication> results = (List<Processcustomapplication>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processcustomapplication").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
