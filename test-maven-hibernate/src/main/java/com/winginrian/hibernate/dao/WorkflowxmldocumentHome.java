package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowxmldocument;

/**
 * Home object for domain model class Workflowxmldocument.
 * @see com.winginrian.hibernate.dao.Workflowxmldocument
 * @author Hibernate Tools
 */
public class WorkflowxmldocumentHome {

	private static final Log log = LogFactory.getLog(WorkflowxmldocumentHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowxmldocument transientInstance) {
		log.debug("persisting Workflowxmldocument instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowxmldocument instance) {
		log.debug("attaching dirty Workflowxmldocument instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowxmldocument instance) {
		log.debug("attaching clean Workflowxmldocument instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowxmldocument persistentInstance) {
		log.debug("deleting Workflowxmldocument instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowxmldocument merge(Workflowxmldocument detachedInstance) {
		log.debug("merging Workflowxmldocument instance");
		try {
			Workflowxmldocument result = (Workflowxmldocument) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowxmldocument findById(java.lang.Integer id) {
		log.debug("getting Workflowxmldocument instance with id: " + id);
		try {
			Workflowxmldocument instance = (Workflowxmldocument) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowxmldocument", id);
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

	public List<Workflowxmldocument> findByExample(Workflowxmldocument instance) {
		log.debug("finding Workflowxmldocument instance by example");
		try {
			List<Workflowxmldocument> results = (List<Workflowxmldocument>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowxmldocument").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
