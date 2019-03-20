package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Packageobject;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Packageobject.
 * @see com.winginrian.hibernate.dao.Packageobject
 * @author Hibernate Tools
 */
public class PackageobjectHome {

	private static final Log log = LogFactory.getLog(PackageobjectHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Packageobject transientInstance) {
		log.debug("persisting Packageobject instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Packageobject instance) {
		log.debug("attaching dirty Packageobject instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Packageobject instance) {
		log.debug("attaching clean Packageobject instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Packageobject persistentInstance) {
		log.debug("deleting Packageobject instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Packageobject merge(Packageobject detachedInstance) {
		log.debug("merging Packageobject instance");
		try {
			Packageobject result = (Packageobject) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Packageobject findById(java.lang.Integer id) {
		log.debug("getting Packageobject instance with id: " + id);
		try {
			Packageobject instance = (Packageobject) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Packageobject", id);
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

	public List<Packageobject> findByExample(Packageobject instance) {
		log.debug("finding Packageobject instance by example");
		try {
			List<Packageobject> results = (List<Packageobject>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Packageobject").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
