package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowactivityrole;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowactivityrole.
 * @see com.winginrian.hibernate.dao.Workflowactivityrole
 * @author Hibernate Tools
 */
public class WorkflowactivityroleHome {

	private static final Log log = LogFactory.getLog(WorkflowactivityroleHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowactivityrole transientInstance) {
		log.debug("persisting Workflowactivityrole instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowactivityrole instance) {
		log.debug("attaching dirty Workflowactivityrole instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowactivityrole instance) {
		log.debug("attaching clean Workflowactivityrole instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowactivityrole persistentInstance) {
		log.debug("deleting Workflowactivityrole instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowactivityrole merge(Workflowactivityrole detachedInstance) {
		log.debug("merging Workflowactivityrole instance");
		try {
			Workflowactivityrole result = (Workflowactivityrole) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowactivityrole findById(java.lang.Integer id) {
		log.debug("getting Workflowactivityrole instance with id: " + id);
		try {
			Workflowactivityrole instance = (Workflowactivityrole) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowactivityrole", id);
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

	public List<Workflowactivityrole> findByExample(Workflowactivityrole instance) {
		log.debug("finding Workflowactivityrole instance by example");
		try {
			List<Workflowactivityrole> results = (List<Workflowactivityrole>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowactivityrole").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
