package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowactivityresource;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowactivityresource.
 * @see com.winginrian.hibernate.dao.Workflowactivityresource
 * @author Hibernate Tools
 */
public class WorkflowactivityresourceHome {

	private static final Log log = LogFactory.getLog(WorkflowactivityresourceHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowactivityresource transientInstance) {
		log.debug("persisting Workflowactivityresource instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowactivityresource instance) {
		log.debug("attaching dirty Workflowactivityresource instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowactivityresource instance) {
		log.debug("attaching clean Workflowactivityresource instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowactivityresource persistentInstance) {
		log.debug("deleting Workflowactivityresource instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowactivityresource merge(Workflowactivityresource detachedInstance) {
		log.debug("merging Workflowactivityresource instance");
		try {
			Workflowactivityresource result = (Workflowactivityresource) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowactivityresource findById(java.lang.Integer id) {
		log.debug("getting Workflowactivityresource instance with id: " + id);
		try {
			Workflowactivityresource instance = (Workflowactivityresource) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowactivityresource", id);
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

	public List<Workflowactivityresource> findByExample(Workflowactivityresource instance) {
		log.debug("finding Workflowactivityresource instance by example");
		try {
			List<Workflowactivityresource> results = (List<Workflowactivityresource>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowactivityresource").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
