package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowcondition;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowcondition.
 * @see com.winginrian.hibernate.dao.Workflowcondition
 * @author Hibernate Tools
 */
public class WorkflowconditionHome {

	private static final Log log = LogFactory.getLog(WorkflowconditionHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowcondition transientInstance) {
		log.debug("persisting Workflowcondition instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowcondition instance) {
		log.debug("attaching dirty Workflowcondition instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowcondition instance) {
		log.debug("attaching clean Workflowcondition instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowcondition persistentInstance) {
		log.debug("deleting Workflowcondition instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowcondition merge(Workflowcondition detachedInstance) {
		log.debug("merging Workflowcondition instance");
		try {
			Workflowcondition result = (Workflowcondition) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowcondition findById(java.lang.Integer id) {
		log.debug("getting Workflowcondition instance with id: " + id);
		try {
			Workflowcondition instance = (Workflowcondition) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowcondition", id);
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

	public List<Workflowcondition> findByExample(Workflowcondition instance) {
		log.debug("finding Workflowcondition instance by example");
		try {
			List<Workflowcondition> results = (List<Workflowcondition>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowcondition").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
