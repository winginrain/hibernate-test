package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowactivityinvokingapplication;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowactivityinvokingapplication.
 * @see com.winginrian.hibernate.dao.Workflowactivityinvokingapplication
 * @author Hibernate Tools
 */
public class WorkflowactivityinvokingapplicationHome {

	private static final Log log = LogFactory.getLog(WorkflowactivityinvokingapplicationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowactivityinvokingapplication transientInstance) {
		log.debug("persisting Workflowactivityinvokingapplication instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowactivityinvokingapplication instance) {
		log.debug("attaching dirty Workflowactivityinvokingapplication instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowactivityinvokingapplication instance) {
		log.debug("attaching clean Workflowactivityinvokingapplication instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowactivityinvokingapplication persistentInstance) {
		log.debug("deleting Workflowactivityinvokingapplication instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowactivityinvokingapplication merge(Workflowactivityinvokingapplication detachedInstance) {
		log.debug("merging Workflowactivityinvokingapplication instance");
		try {
			Workflowactivityinvokingapplication result = (Workflowactivityinvokingapplication) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowactivityinvokingapplication findById(java.lang.Integer id) {
		log.debug("getting Workflowactivityinvokingapplication instance with id: " + id);
		try {
			Workflowactivityinvokingapplication instance = (Workflowactivityinvokingapplication) sessionFactory
					.getCurrentSession().get("com.winginrian.hibernate.dao.Workflowactivityinvokingapplication", id);
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

	public List<Workflowactivityinvokingapplication> findByExample(Workflowactivityinvokingapplication instance) {
		log.debug("finding Workflowactivityinvokingapplication instance by example");
		try {
			List<Workflowactivityinvokingapplication> results = (List<Workflowactivityinvokingapplication>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowactivityinvokingapplication")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
