package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processobject;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processobject.
 * @see com.winginrian.hibernate.dao.Processobject
 * @author Hibernate Tools
 */
public class ProcessobjectHome {

	private static final Log log = LogFactory.getLog(ProcessobjectHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processobject transientInstance) {
		log.debug("persisting Processobject instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processobject instance) {
		log.debug("attaching dirty Processobject instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processobject instance) {
		log.debug("attaching clean Processobject instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processobject persistentInstance) {
		log.debug("deleting Processobject instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processobject merge(Processobject detachedInstance) {
		log.debug("merging Processobject instance");
		try {
			Processobject result = (Processobject) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processobject findById(java.lang.Integer id) {
		log.debug("getting Processobject instance with id: " + id);
		try {
			Processobject instance = (Processobject) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processobject", id);
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

	public List<Processobject> findByExample(Processobject instance) {
		log.debug("finding Processobject instance by example");
		try {
			List<Processobject> results = (List<Processobject>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processobject").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
