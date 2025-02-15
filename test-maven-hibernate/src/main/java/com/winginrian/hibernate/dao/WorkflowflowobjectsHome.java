package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowflowobjects;

/**
 * Home object for domain model class Workflowflowobjects.
 * @see com.winginrian.hibernate.dao.Workflowflowobjects
 * @author Hibernate Tools
 */
public class WorkflowflowobjectsHome {

	private static final Log log = LogFactory.getLog(WorkflowflowobjectsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowflowobjects transientInstance) {
		log.debug("persisting Workflowflowobjects instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowflowobjects instance) {
		log.debug("attaching dirty Workflowflowobjects instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowflowobjects instance) {
		log.debug("attaching clean Workflowflowobjects instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowflowobjects persistentInstance) {
		log.debug("deleting Workflowflowobjects instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowflowobjects merge(Workflowflowobjects detachedInstance) {
		log.debug("merging Workflowflowobjects instance");
		try {
			Workflowflowobjects result = (Workflowflowobjects) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowflowobjects findById(java.lang.Integer id) {
		log.debug("getting Workflowflowobjects instance with id: " + id);
		try {
			Workflowflowobjects instance = (Workflowflowobjects) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowflowobjects", id);
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

	public List<Workflowflowobjects> findByExample(Workflowflowobjects instance) {
		log.debug("finding Workflowflowobjects instance by example");
		try {
			List<Workflowflowobjects> results = (List<Workflowflowobjects>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowflowobjects").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
