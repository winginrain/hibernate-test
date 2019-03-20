package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Systemschema;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Systemschema.
 * @see com.winginrian.hibernate.dao.Systemschema
 * @author Hibernate Tools
 */
public class SystemschemaHome {

	private static final Log log = LogFactory.getLog(SystemschemaHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Systemschema transientInstance) {
		log.debug("persisting Systemschema instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Systemschema instance) {
		log.debug("attaching dirty Systemschema instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Systemschema instance) {
		log.debug("attaching clean Systemschema instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Systemschema persistentInstance) {
		log.debug("deleting Systemschema instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Systemschema merge(Systemschema detachedInstance) {
		log.debug("merging Systemschema instance");
		try {
			Systemschema result = (Systemschema) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Systemschema findById(java.lang.Integer id) {
		log.debug("getting Systemschema instance with id: " + id);
		try {
			Systemschema instance = (Systemschema) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Systemschema", id);
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

	public List<Systemschema> findByExample(Systemschema instance) {
		log.debug("finding Systemschema instance by example");
		try {
			List<Systemschema> results = (List<Systemschema>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Systemschema").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
