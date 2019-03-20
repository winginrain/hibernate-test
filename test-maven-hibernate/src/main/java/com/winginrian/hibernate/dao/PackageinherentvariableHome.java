package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Packageinherentvariable;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Packageinherentvariable.
 * @see com.winginrian.hibernate.dao.Packageinherentvariable
 * @author Hibernate Tools
 */
public class PackageinherentvariableHome {

	private static final Log log = LogFactory.getLog(PackageinherentvariableHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Packageinherentvariable transientInstance) {
		log.debug("persisting Packageinherentvariable instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Packageinherentvariable instance) {
		log.debug("attaching dirty Packageinherentvariable instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Packageinherentvariable instance) {
		log.debug("attaching clean Packageinherentvariable instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Packageinherentvariable persistentInstance) {
		log.debug("deleting Packageinherentvariable instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Packageinherentvariable merge(Packageinherentvariable detachedInstance) {
		log.debug("merging Packageinherentvariable instance");
		try {
			Packageinherentvariable result = (Packageinherentvariable) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Packageinherentvariable findById(java.lang.Integer id) {
		log.debug("getting Packageinherentvariable instance with id: " + id);
		try {
			Packageinherentvariable instance = (Packageinherentvariable) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Packageinherentvariable", id);
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

	public List<Packageinherentvariable> findByExample(Packageinherentvariable instance) {
		log.debug("finding Packageinherentvariable instance by example");
		try {
			List<Packageinherentvariable> results = (List<Packageinherentvariable>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Packageinherentvariable").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
