package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processapplication;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processapplication.
 * @see com.winginrian.hibernate.dao.Processapplication
 * @author Hibernate Tools
 */
public class ProcessapplicationHome {

	private static final Log log = LogFactory.getLog(ProcessapplicationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processapplication transientInstance) {
		log.debug("persisting Processapplication instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processapplication instance) {
		log.debug("attaching dirty Processapplication instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processapplication instance) {
		log.debug("attaching clean Processapplication instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processapplication persistentInstance) {
		log.debug("deleting Processapplication instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processapplication merge(Processapplication detachedInstance) {
		log.debug("merging Processapplication instance");
		try {
			Processapplication result = (Processapplication) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processapplication findById(java.lang.Integer id) {
		log.debug("getting Processapplication instance with id: " + id);
		try {
			Processapplication instance = (Processapplication) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processapplication", id);
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

	public List<Processapplication> findByExample(Processapplication instance) {
		log.debug("finding Processapplication instance by example");
		try {
			List<Processapplication> results = (List<Processapplication>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processapplication").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
