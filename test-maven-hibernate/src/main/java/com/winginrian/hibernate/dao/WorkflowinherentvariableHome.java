
package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowinherentvariable;

/**
 * Home object for domain model class Workflowinherentvariable.
 * @see com.winginrian.hibernate.dao.Workflowinherentvariable
 * @author Hibernate Tools
 */
public class WorkflowinherentvariableHome {

	private static final Log log = LogFactory.getLog(WorkflowinherentvariableHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowinherentvariable transientInstance) {
		log.debug("persisting Workflowinherentvariable instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowinherentvariable instance) {
		log.debug("attaching dirty Workflowinherentvariable instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowinherentvariable instance) {
		log.debug("attaching clean Workflowinherentvariable instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowinherentvariable persistentInstance) {
		log.debug("deleting Workflowinherentvariable instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowinherentvariable merge(Workflowinherentvariable detachedInstance) {
		log.debug("merging Workflowinherentvariable instance");
		try {
			Workflowinherentvariable result = (Workflowinherentvariable) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowinherentvariable findById(java.lang.Integer id) {
		log.debug("getting Workflowinherentvariable instance with id: " + id);
		try {
			Workflowinherentvariable instance = (Workflowinherentvariable) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowinherentvariable", id);
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

	public List<Workflowinherentvariable> findByExample(Workflowinherentvariable instance) {
		log.debug("finding Workflowinherentvariable instance by example");
		try {
			List<Workflowinherentvariable> results = (List<Workflowinherentvariable>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowinherentvariable").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
