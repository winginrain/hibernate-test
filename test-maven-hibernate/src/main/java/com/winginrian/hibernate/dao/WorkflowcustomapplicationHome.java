package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowcustomapplication;

/**
 * Home object for domain model class Workflowcustomapplication.
 * @see com.winginrian.hibernate.dao.Workflowcustomapplication
 * @author Hibernate Tools
 */
public class WorkflowcustomapplicationHome {

	private static final Log log = LogFactory.getLog(WorkflowcustomapplicationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowcustomapplication transientInstance) {
		log.debug("persisting Workflowcustomapplication instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowcustomapplication instance) {
		log.debug("attaching dirty Workflowcustomapplication instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowcustomapplication instance) {
		log.debug("attaching clean Workflowcustomapplication instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowcustomapplication persistentInstance) {
		log.debug("deleting Workflowcustomapplication instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowcustomapplication merge(Workflowcustomapplication detachedInstance) {
		log.debug("merging Workflowcustomapplication instance");
		try {
			Workflowcustomapplication result = (Workflowcustomapplication) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowcustomapplication findById(java.lang.Integer id) {
		log.debug("getting Workflowcustomapplication instance with id: " + id);
		try {
			Workflowcustomapplication instance = (Workflowcustomapplication) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowcustomapplication", id);
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

	public List<Workflowcustomapplication> findByExample(Workflowcustomapplication instance) {
		log.debug("finding Workflowcustomapplication instance by example");
		try {
			List<Workflowcustomapplication> results = (List<Workflowcustomapplication>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Workflowcustomapplication")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
