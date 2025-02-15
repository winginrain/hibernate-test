package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processactivityinformation;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processactivityinformation.
 * @see com.winginrian.hibernate.dao.Processactivityinformation
 * @author Hibernate Tools
 */
public class ProcessactivityinformationHome {

	private static final Log log = LogFactory.getLog(ProcessactivityinformationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processactivityinformation transientInstance) {
		log.debug("persisting Processactivityinformation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processactivityinformation instance) {
		log.debug("attaching dirty Processactivityinformation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processactivityinformation instance) {
		log.debug("attaching clean Processactivityinformation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processactivityinformation persistentInstance) {
		log.debug("deleting Processactivityinformation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processactivityinformation merge(Processactivityinformation detachedInstance) {
		log.debug("merging Processactivityinformation instance");
		try {
			Processactivityinformation result = (Processactivityinformation) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processactivityinformation findById(java.lang.Integer id) {
		log.debug("getting Processactivityinformation instance with id: " + id);
		try {
			Processactivityinformation instance = (Processactivityinformation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processactivityinformation", id);
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

	public List<Processactivityinformation> findByExample(Processactivityinformation instance) {
		log.debug("finding Processactivityinformation instance by example");
		try {
			List<Processactivityinformation> results = (List<Processactivityinformation>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Processactivityinformation")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
