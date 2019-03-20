package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processresource;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processresource.
 * @see com.winginrian.hibernate.dao.Processresource
 * @author Hibernate Tools
 */
public class ProcessresourceHome {

	private static final Log log = LogFactory.getLog(ProcessresourceHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processresource transientInstance) {
		log.debug("persisting Processresource instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processresource instance) {
		log.debug("attaching dirty Processresource instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processresource instance) {
		log.debug("attaching clean Processresource instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processresource persistentInstance) {
		log.debug("deleting Processresource instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processresource merge(Processresource detachedInstance) {
		log.debug("merging Processresource instance");
		try {
			Processresource result = (Processresource) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processresource findById(java.lang.Integer id) {
		log.debug("getting Processresource instance with id: " + id);
		try {
			Processresource instance = (Processresource) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processresource", id);
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

	public List<Processresource> findByExample(Processresource instance) {
		log.debug("finding Processresource instance by example");
		try {
			List<Processresource> results = (List<Processresource>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processresource").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
