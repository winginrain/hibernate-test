package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowflowobjectcontrol;

/**
 * Home object for domain model class Workflowflowobjectcontrol.
 * @see com.winginrian.hibernate.dao.Workflowflowobjectcontrol
 * @author Hibernate Tools
 */
public class WorkflowflowobjectcontrolHome {

	private static final Log log = LogFactory.getLog(WorkflowflowobjectcontrolHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowflowobjectcontrol transientInstance) {
		log.debug("persisting Workflowflowobjectcontrol instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowflowobjectcontrol instance) {
		log.debug("attaching dirty Workflowflowobjectcontrol instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowflowobjectcontrol instance) {
		log.debug("attaching clean Workflowflowobjectcontrol instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowflowobjectcontrol persistentInstance) {
		log.debug("deleting Workflowflowobjectcontrol instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowflowobjectcontrol merge(Workflowflowobjectcontrol detachedInstance) {
		log.debug("merging Workflowflowobjectcontrol instance");
		try {
			Workflowflowobjectcontrol result = (Workflowflowobjectcontrol) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowflowobjectcontrol findById(java.lang.Integer id) {
		log.debug("getting Workflowflowobjectcontrol instance with id: " + id);
		try {
			Workflowflowobjectcontrol instance = (Workflowflowobjectcontrol) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowflowobjectcontrol", id);
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

	public List<Workflowflowobjectcontrol> findByExample(Workflowflowobjectcontrol instance) {
		log.debug("finding Workflowflowobjectcontrol instance by example");
		try {
			List<Workflowflowobjectcontrol> results = (List<Workflowflowobjectcontrol>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Workflowflowobjectcontrol")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
