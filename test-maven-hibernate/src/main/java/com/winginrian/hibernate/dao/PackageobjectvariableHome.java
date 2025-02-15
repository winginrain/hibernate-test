package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Packageobjectvariable;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Packageobjectvariable.
 * @see com.winginrian.hibernate.dao.Packageobjectvariable
 * @author Hibernate Tools
 */
public class PackageobjectvariableHome {

	private static final Log log = LogFactory.getLog(PackageobjectvariableHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Packageobjectvariable transientInstance) {
		log.debug("persisting Packageobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Packageobjectvariable instance) {
		log.debug("attaching dirty Packageobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Packageobjectvariable instance) {
		log.debug("attaching clean Packageobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Packageobjectvariable persistentInstance) {
		log.debug("deleting Packageobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Packageobjectvariable merge(Packageobjectvariable detachedInstance) {
		log.debug("merging Packageobjectvariable instance");
		try {
			Packageobjectvariable result = (Packageobjectvariable) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Packageobjectvariable findById(java.lang.Integer id) {
		log.debug("getting Packageobjectvariable instance with id: " + id);
		try {
			Packageobjectvariable instance = (Packageobjectvariable) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Packageobjectvariable", id);
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

	public List<Packageobjectvariable> findByExample(Packageobjectvariable instance) {
		log.debug("finding Packageobjectvariable instance by example");
		try {
			List<Packageobjectvariable> results = (List<Packageobjectvariable>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Packageobjectvariable").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
