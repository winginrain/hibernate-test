package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowactivityinvokingcustomapplication;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowactivityinvokingcustomapplication.
 * @see com.winginrian.hibernate.dao.Workflowactivityinvokingcustomapplication
 * @author Hibernate Tools
 */
public class WorkflowactivityinvokingcustomapplicationHome {

	private static final Log log = LogFactory.getLog(WorkflowactivityinvokingcustomapplicationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowactivityinvokingcustomapplication transientInstance) {
		log.debug("persisting Workflowactivityinvokingcustomapplication instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowactivityinvokingcustomapplication instance) {
		log.debug("attaching dirty Workflowactivityinvokingcustomapplication instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowactivityinvokingcustomapplication instance) {
		log.debug("attaching clean Workflowactivityinvokingcustomapplication instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowactivityinvokingcustomapplication persistentInstance) {
		log.debug("deleting Workflowactivityinvokingcustomapplication instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowactivityinvokingcustomapplication merge(Workflowactivityinvokingcustomapplication detachedInstance) {
		log.debug("merging Workflowactivityinvokingcustomapplication instance");
		try {
			Workflowactivityinvokingcustomapplication result = (Workflowactivityinvokingcustomapplication) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowactivityinvokingcustomapplication findById(java.lang.Integer id) {
		log.debug("getting Workflowactivityinvokingcustomapplication instance with id: " + id);
		try {
			Workflowactivityinvokingcustomapplication instance = (Workflowactivityinvokingcustomapplication) sessionFactory
					.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowactivityinvokingcustomapplication", id);
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

	public List<Workflowactivityinvokingcustomapplication> findByExample(
			Workflowactivityinvokingcustomapplication instance) {
		log.debug("finding Workflowactivityinvokingcustomapplication instance by example");
		try {
			List<Workflowactivityinvokingcustomapplication> results = (List<Workflowactivityinvokingcustomapplication>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowactivityinvokingcustomapplication")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
