package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processpersons;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processpersons.
 * @see com.winginrian.hibernate.dao.Processpersons
 * @author Hibernate Tools
 */
public class ProcesspersonsHome {

	private static final Log log = LogFactory.getLog(ProcesspersonsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processpersons transientInstance) {
		log.debug("persisting Processpersons instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processpersons instance) {
		log.debug("attaching dirty Processpersons instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processpersons instance) {
		log.debug("attaching clean Processpersons instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processpersons persistentInstance) {
		log.debug("deleting Processpersons instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processpersons merge(Processpersons detachedInstance) {
		log.debug("merging Processpersons instance");
		try {
			Processpersons result = (Processpersons) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processpersons findById(java.lang.Integer id) {
		log.debug("getting Processpersons instance with id: " + id);
		try {
			Processpersons instance = (Processpersons) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processpersons", id);
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

	public List<Processpersons> findByExample(Processpersons instance) {
		log.debug("finding Processpersons instance by example");
		try {
			List<Processpersons> results = (List<Processpersons>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processpersons").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
