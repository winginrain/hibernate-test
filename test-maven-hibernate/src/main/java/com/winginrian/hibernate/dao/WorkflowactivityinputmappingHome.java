package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowactivityinputmapping;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowactivityinputmapping.
 * @see com.winginrian.hibernate.dao.Workflowactivityinputmapping
 * @author Hibernate Tools
 */
public class WorkflowactivityinputmappingHome {

	private static final Log log = LogFactory.getLog(WorkflowactivityinputmappingHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowactivityinputmapping transientInstance) {
		log.debug("persisting Workflowactivityinputmapping instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowactivityinputmapping instance) {
		log.debug("attaching dirty Workflowactivityinputmapping instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowactivityinputmapping instance) {
		log.debug("attaching clean Workflowactivityinputmapping instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowactivityinputmapping persistentInstance) {
		log.debug("deleting Workflowactivityinputmapping instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowactivityinputmapping merge(Workflowactivityinputmapping detachedInstance) {
		log.debug("merging Workflowactivityinputmapping instance");
		try {
			Workflowactivityinputmapping result = (Workflowactivityinputmapping) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowactivityinputmapping findById(java.lang.Integer id) {
		log.debug("getting Workflowactivityinputmapping instance with id: " + id);
		try {
			Workflowactivityinputmapping instance = (Workflowactivityinputmapping) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowactivityinputmapping", id);
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

	public List<Workflowactivityinputmapping> findByExample(Workflowactivityinputmapping instance) {
		log.debug("finding Workflowactivityinputmapping instance by example");
		try {
			List<Workflowactivityinputmapping> results = (List<Workflowactivityinputmapping>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Workflowactivityinputmapping")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
