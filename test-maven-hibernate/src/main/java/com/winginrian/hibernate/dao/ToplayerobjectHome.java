package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Toplayerobject;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Toplayerobject.
 * @see com.winginrian.hibernate.dao.Toplayerobject
 * @author Hibernate Tools
 */
public class ToplayerobjectHome {

	private static final Log log = LogFactory.getLog(ToplayerobjectHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Toplayerobject transientInstance) {
		log.debug("persisting Toplayerobject instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Toplayerobject instance) {
		log.debug("attaching dirty Toplayerobject instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Toplayerobject instance) {
		log.debug("attaching clean Toplayerobject instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Toplayerobject persistentInstance) {
		log.debug("deleting Toplayerobject instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Toplayerobject merge(Toplayerobject detachedInstance) {
		log.debug("merging Toplayerobject instance");
		try {
			Toplayerobject result = (Toplayerobject) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Toplayerobject findById(java.lang.Integer id) {
		log.debug("getting Toplayerobject instance with id: " + id);
		try {
			Toplayerobject instance = (Toplayerobject) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Toplayerobject", id);
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

	public List<Toplayerobject> findByExample(Toplayerobject instance) {
		log.debug("finding Toplayerobject instance by example");
		try {
			List<Toplayerobject> results = (List<Toplayerobject>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Toplayerobject").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
