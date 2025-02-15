package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowobjectvariable;

/**
 * Home object for domain model class Workflowobjectvariable.
 * @see com.winginrian.hibernate.dao.Workflowobjectvariable
 * @author Hibernate Tools
 */
public class WorkflowobjectvariableHome {

	private static final Log log = LogFactory.getLog(WorkflowobjectvariableHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowobjectvariable transientInstance) {
		log.debug("persisting Workflowobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowobjectvariable instance) {
		log.debug("attaching dirty Workflowobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowobjectvariable instance) {
		log.debug("attaching clean Workflowobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowobjectvariable persistentInstance) {
		log.debug("deleting Workflowobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowobjectvariable merge(Workflowobjectvariable detachedInstance) {
		log.debug("merging Workflowobjectvariable instance");
		try {
			Workflowobjectvariable result = (Workflowobjectvariable) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowobjectvariable findById(java.lang.Integer id) {
		log.debug("getting Workflowobjectvariable instance with id: " + id);
		try {
			Workflowobjectvariable instance = (Workflowobjectvariable) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowobjectvariable", id);
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

	public List<Workflowobjectvariable> findByExample(Workflowobjectvariable instance) {
		log.debug("finding Workflowobjectvariable instance by example");
		try {
			List<Workflowobjectvariable> results = (List<Workflowobjectvariable>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowobjectvariable").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
