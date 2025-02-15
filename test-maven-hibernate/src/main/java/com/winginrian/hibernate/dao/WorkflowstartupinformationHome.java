package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowstartupinformation;

/**
 * Home object for domain model class Workflowstartupinformation.
 * @see com.winginrian.hibernate.dao.Workflowstartupinformation
 * @author Hibernate Tools
 */
public class WorkflowstartupinformationHome {

	private static final Log log = LogFactory.getLog(WorkflowstartupinformationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowstartupinformation transientInstance) {
		log.debug("persisting Workflowstartupinformation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowstartupinformation instance) {
		log.debug("attaching dirty Workflowstartupinformation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowstartupinformation instance) {
		log.debug("attaching clean Workflowstartupinformation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowstartupinformation persistentInstance) {
		log.debug("deleting Workflowstartupinformation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowstartupinformation merge(Workflowstartupinformation detachedInstance) {
		log.debug("merging Workflowstartupinformation instance");
		try {
			Workflowstartupinformation result = (Workflowstartupinformation) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowstartupinformation findById(java.lang.Integer id) {
		log.debug("getting Workflowstartupinformation instance with id: " + id);
		try {
			Workflowstartupinformation instance = (Workflowstartupinformation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowstartupinformation", id);
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

	public List<Workflowstartupinformation> findByExample(Workflowstartupinformation instance) {
		log.debug("finding Workflowstartupinformation instance by example");
		try {
			List<Workflowstartupinformation> results = (List<Workflowstartupinformation>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Workflowstartupinformation")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
