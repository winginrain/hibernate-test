package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Packagecustomapplication;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Packagecustomapplication.
 * @see com.winginrian.hibernate.dao.Packagecustomapplication
 * @author Hibernate Tools
 */
public class PackagecustomapplicationHome {

	private static final Log log = LogFactory.getLog(PackagecustomapplicationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Packagecustomapplication transientInstance) {
		log.debug("persisting Packagecustomapplication instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Packagecustomapplication instance) {
		log.debug("attaching dirty Packagecustomapplication instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Packagecustomapplication instance) {
		log.debug("attaching clean Packagecustomapplication instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Packagecustomapplication persistentInstance) {
		log.debug("deleting Packagecustomapplication instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Packagecustomapplication merge(Packagecustomapplication detachedInstance) {
		log.debug("merging Packagecustomapplication instance");
		try {
			Packagecustomapplication result = (Packagecustomapplication) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Packagecustomapplication findById(java.lang.Integer id) {
		log.debug("getting Packagecustomapplication instance with id: " + id);
		try {
			Packagecustomapplication instance = (Packagecustomapplication) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Packagecustomapplication", id);
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

	public List<Packagecustomapplication> findByExample(Packagecustomapplication instance) {
		log.debug("finding Packagecustomapplication instance by example");
		try {
			List<Packagecustomapplication> results = (List<Packagecustomapplication>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Packagecustomapplication").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
