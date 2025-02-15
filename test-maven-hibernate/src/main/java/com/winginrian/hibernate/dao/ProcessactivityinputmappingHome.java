package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processactivityinputmapping;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processactivityinputmapping.
 * @see com.winginrian.hibernate.dao.Processactivityinputmapping
 * @author Hibernate Tools
 */
public class ProcessactivityinputmappingHome {

	private static final Log log = LogFactory.getLog(ProcessactivityinputmappingHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processactivityinputmapping transientInstance) {
		log.debug("persisting Processactivityinputmapping instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processactivityinputmapping instance) {
		log.debug("attaching dirty Processactivityinputmapping instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processactivityinputmapping instance) {
		log.debug("attaching clean Processactivityinputmapping instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processactivityinputmapping persistentInstance) {
		log.debug("deleting Processactivityinputmapping instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processactivityinputmapping merge(Processactivityinputmapping detachedInstance) {
		log.debug("merging Processactivityinputmapping instance");
		try {
			Processactivityinputmapping result = (Processactivityinputmapping) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processactivityinputmapping findById(java.lang.Integer id) {
		log.debug("getting Processactivityinputmapping instance with id: " + id);
		try {
			Processactivityinputmapping instance = (Processactivityinputmapping) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processactivityinputmapping", id);
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

	public List<Processactivityinputmapping> findByExample(Processactivityinputmapping instance) {
		log.debug("finding Processactivityinputmapping instance by example");
		try {
			List<Processactivityinputmapping> results = (List<Processactivityinputmapping>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Processactivityinputmapping")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
