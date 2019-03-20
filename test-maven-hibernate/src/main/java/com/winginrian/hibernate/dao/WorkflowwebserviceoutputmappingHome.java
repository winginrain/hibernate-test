package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowwebserviceoutputmapping;

/**
 * Home object for domain model class Workflowwebserviceoutputmapping.
 * @see com.winginrian.hibernate.dao.Workflowwebserviceoutputmapping
 * @author Hibernate Tools
 */
public class WorkflowwebserviceoutputmappingHome {

	private static final Log log = LogFactory.getLog(WorkflowwebserviceoutputmappingHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowwebserviceoutputmapping transientInstance) {
		log.debug("persisting Workflowwebserviceoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowwebserviceoutputmapping instance) {
		log.debug("attaching dirty Workflowwebserviceoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowwebserviceoutputmapping instance) {
		log.debug("attaching clean Workflowwebserviceoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowwebserviceoutputmapping persistentInstance) {
		log.debug("deleting Workflowwebserviceoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowwebserviceoutputmapping merge(Workflowwebserviceoutputmapping detachedInstance) {
		log.debug("merging Workflowwebserviceoutputmapping instance");
		try {
			Workflowwebserviceoutputmapping result = (Workflowwebserviceoutputmapping) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowwebserviceoutputmapping findById(java.lang.Integer id) {
		log.debug("getting Workflowwebserviceoutputmapping instance with id: " + id);
		try {
			Workflowwebserviceoutputmapping instance = (Workflowwebserviceoutputmapping) sessionFactory
					.getCurrentSession().get("com.winginrian.hibernate.dao.Workflowwebserviceoutputmapping", id);
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

	public List<Workflowwebserviceoutputmapping> findByExample(Workflowwebserviceoutputmapping instance) {
		log.debug("finding Workflowwebserviceoutputmapping instance by example");
		try {
			List<Workflowwebserviceoutputmapping> results = (List<Workflowwebserviceoutputmapping>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Workflowwebserviceoutputmapping")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
