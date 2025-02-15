package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workfloweventrelation;

/**
 * Home object for domain model class Workfloweventrelation.
 * @see com.winginrian.hibernate.dao.Workfloweventrelation
 * @author Hibernate Tools
 */
public class WorkfloweventrelationHome {

	private static final Log log = LogFactory.getLog(WorkfloweventrelationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workfloweventrelation transientInstance) {
		log.debug("persisting Workfloweventrelation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workfloweventrelation instance) {
		log.debug("attaching dirty Workfloweventrelation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workfloweventrelation instance) {
		log.debug("attaching clean Workfloweventrelation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workfloweventrelation persistentInstance) {
		log.debug("deleting Workfloweventrelation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workfloweventrelation merge(Workfloweventrelation detachedInstance) {
		log.debug("merging Workfloweventrelation instance");
		try {
			Workfloweventrelation result = (Workfloweventrelation) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workfloweventrelation findById(java.lang.Integer id) {
		log.debug("getting Workfloweventrelation instance with id: " + id);
		try {
			Workfloweventrelation instance = (Workfloweventrelation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workfloweventrelation", id);
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

	public List<Workfloweventrelation> findByExample(Workfloweventrelation instance) {
		log.debug("finding Workfloweventrelation instance by example");
		try {
			List<Workfloweventrelation> results = (List<Workfloweventrelation>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workfloweventrelation").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
