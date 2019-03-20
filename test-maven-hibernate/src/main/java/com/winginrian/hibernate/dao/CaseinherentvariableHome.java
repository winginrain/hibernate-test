package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Caseinherentvariable;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Caseinherentvariable.
 * @see com.winginrian.hibernate.dao.Caseinherentvariable
 * @author Hibernate Tools
 */
public class CaseinherentvariableHome {

	private static final Log log = LogFactory.getLog(CaseinherentvariableHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Caseinherentvariable transientInstance) {
		log.debug("persisting Caseinherentvariable instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Caseinherentvariable instance) {
		log.debug("attaching dirty Caseinherentvariable instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Caseinherentvariable instance) {
		log.debug("attaching clean Caseinherentvariable instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Caseinherentvariable persistentInstance) {
		log.debug("deleting Caseinherentvariable instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Caseinherentvariable merge(Caseinherentvariable detachedInstance) {
		log.debug("merging Caseinherentvariable instance");
		try {
			Caseinherentvariable result = (Caseinherentvariable) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Caseinherentvariable findById(java.lang.Integer id) {
		log.debug("getting Caseinherentvariable instance with id: " + id);
		try {
			Caseinherentvariable instance = (Caseinherentvariable) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Caseinherentvariable", id);
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

	public List<Caseinherentvariable> findByExample(Caseinherentvariable instance) {
		log.debug("finding Caseinherentvariable instance by example");
		try {
			List<Caseinherentvariable> results = (List<Caseinherentvariable>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Caseinherentvariable").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
