package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processactivityschedule;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processactivityschedule.
 * @see com.winginrian.hibernate.dao.Processactivityschedule
 * @author Hibernate Tools
 */
public class ProcessactivityscheduleHome {

	private static final Log log = LogFactory.getLog(ProcessactivityscheduleHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processactivityschedule transientInstance) {
		log.debug("persisting Processactivityschedule instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processactivityschedule instance) {
		log.debug("attaching dirty Processactivityschedule instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processactivityschedule instance) {
		log.debug("attaching clean Processactivityschedule instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processactivityschedule persistentInstance) {
		log.debug("deleting Processactivityschedule instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processactivityschedule merge(Processactivityschedule detachedInstance) {
		log.debug("merging Processactivityschedule instance");
		try {
			Processactivityschedule result = (Processactivityschedule) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processactivityschedule findById(java.lang.Integer id) {
		log.debug("getting Processactivityschedule instance with id: " + id);
		try {
			Processactivityschedule instance = (Processactivityschedule) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processactivityschedule", id);
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

	public List<Processactivityschedule> findByExample(Processactivityschedule instance) {
		log.debug("finding Processactivityschedule instance by example");
		try {
			List<Processactivityschedule> results = (List<Processactivityschedule>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processactivityschedule").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
