package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowactivityecarule;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowactivityecarule.
 * @see com.winginrian.hibernate.dao.Workflowactivityecarule
 * @author Hibernate Tools
 */
public class WorkflowactivityecaruleHome {

	private static final Log log = LogFactory.getLog(WorkflowactivityecaruleHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowactivityecarule transientInstance) {
		log.debug("persisting Workflowactivityecarule instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowactivityecarule instance) {
		log.debug("attaching dirty Workflowactivityecarule instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowactivityecarule instance) {
		log.debug("attaching clean Workflowactivityecarule instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowactivityecarule persistentInstance) {
		log.debug("deleting Workflowactivityecarule instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowactivityecarule merge(Workflowactivityecarule detachedInstance) {
		log.debug("merging Workflowactivityecarule instance");
		try {
			Workflowactivityecarule result = (Workflowactivityecarule) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowactivityecarule findById(java.lang.Integer id) {
		log.debug("getting Workflowactivityecarule instance with id: " + id);
		try {
			Workflowactivityecarule instance = (Workflowactivityecarule) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowactivityecarule", id);
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

	public List<Workflowactivityecarule> findByExample(Workflowactivityecarule instance) {
		log.debug("finding Workflowactivityecarule instance by example");
		try {
			List<Workflowactivityecarule> results = (List<Workflowactivityecarule>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowactivityecarule").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
