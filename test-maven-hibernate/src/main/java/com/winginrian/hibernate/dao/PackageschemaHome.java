package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Packageschema;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Packageschema.
 * @see com.winginrian.hibernate.dao.Packageschema
 * @author Hibernate Tools
 */
public class PackageschemaHome {

	private static final Log log = LogFactory.getLog(PackageschemaHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Packageschema transientInstance) {
		log.debug("persisting Packageschema instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Packageschema instance) {
		log.debug("attaching dirty Packageschema instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Packageschema instance) {
		log.debug("attaching clean Packageschema instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Packageschema persistentInstance) {
		log.debug("deleting Packageschema instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Packageschema merge(Packageschema detachedInstance) {
		log.debug("merging Packageschema instance");
		try {
			Packageschema result = (Packageschema) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Packageschema findById(java.lang.Integer id) {
		log.debug("getting Packageschema instance with id: " + id);
		try {
			Packageschema instance = (Packageschema) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Packageschema", id);
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

	public List<Packageschema> findByExample(Packageschema instance) {
		log.debug("finding Packageschema instance by example");
		try {
			List<Packageschema> results = (List<Packageschema>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Packageschema").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
