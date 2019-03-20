package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowresponsibleroles;

/**
 * Home object for domain model class Workflowresponsibleroles.
 * @see com.winginrian.hibernate.dao.Workflowresponsibleroles
 * @author Hibernate Tools
 */
public class WorkflowresponsiblerolesHome {

	private static final Log log = LogFactory.getLog(WorkflowresponsiblerolesHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowresponsibleroles transientInstance) {
		log.debug("persisting Workflowresponsibleroles instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowresponsibleroles instance) {
		log.debug("attaching dirty Workflowresponsibleroles instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowresponsibleroles instance) {
		log.debug("attaching clean Workflowresponsibleroles instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowresponsibleroles persistentInstance) {
		log.debug("deleting Workflowresponsibleroles instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowresponsibleroles merge(Workflowresponsibleroles detachedInstance) {
		log.debug("merging Workflowresponsibleroles instance");
		try {
			Workflowresponsibleroles result = (Workflowresponsibleroles) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowresponsibleroles findById(java.lang.Integer id) {
		log.debug("getting Workflowresponsibleroles instance with id: " + id);
		try {
			Workflowresponsibleroles instance = (Workflowresponsibleroles) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowresponsibleroles", id);
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

	public List<Workflowresponsibleroles> findByExample(Workflowresponsibleroles instance) {
		log.debug("finding Workflowresponsibleroles instance by example");
		try {
			List<Workflowresponsibleroles> results = (List<Workflowresponsibleroles>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowresponsibleroles").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
