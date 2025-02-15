package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processactivitytransformxml;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processactivitytransformxml.
 * @see com.winginrian.hibernate.dao.Processactivitytransformxml
 * @author Hibernate Tools
 */
public class ProcessactivitytransformxmlHome {

	private static final Log log = LogFactory.getLog(ProcessactivitytransformxmlHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processactivitytransformxml transientInstance) {
		log.debug("persisting Processactivitytransformxml instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processactivitytransformxml instance) {
		log.debug("attaching dirty Processactivitytransformxml instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processactivitytransformxml instance) {
		log.debug("attaching clean Processactivitytransformxml instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processactivitytransformxml persistentInstance) {
		log.debug("deleting Processactivitytransformxml instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processactivitytransformxml merge(Processactivitytransformxml detachedInstance) {
		log.debug("merging Processactivitytransformxml instance");
		try {
			Processactivitytransformxml result = (Processactivitytransformxml) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processactivitytransformxml findById(java.lang.Integer id) {
		log.debug("getting Processactivitytransformxml instance with id: " + id);
		try {
			Processactivitytransformxml instance = (Processactivitytransformxml) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processactivitytransformxml", id);
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

	public List<Processactivitytransformxml> findByExample(Processactivitytransformxml instance) {
		log.debug("finding Processactivitytransformxml instance by example");
		try {
			List<Processactivitytransformxml> results = (List<Processactivitytransformxml>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Processactivitytransformxml")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
