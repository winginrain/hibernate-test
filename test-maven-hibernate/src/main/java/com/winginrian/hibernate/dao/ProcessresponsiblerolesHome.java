package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processresponsibleroles;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processresponsibleroles.
 * @see com.winginrian.hibernate.dao.Processresponsibleroles
 * @author Hibernate Tools
 */
public class ProcessresponsiblerolesHome {

	private static final Log log = LogFactory.getLog(ProcessresponsiblerolesHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processresponsibleroles transientInstance) {
		log.debug("persisting Processresponsibleroles instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processresponsibleroles instance) {
		log.debug("attaching dirty Processresponsibleroles instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processresponsibleroles instance) {
		log.debug("attaching clean Processresponsibleroles instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processresponsibleroles persistentInstance) {
		log.debug("deleting Processresponsibleroles instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processresponsibleroles merge(Processresponsibleroles detachedInstance) {
		log.debug("merging Processresponsibleroles instance");
		try {
			Processresponsibleroles result = (Processresponsibleroles) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processresponsibleroles findById(java.lang.Integer id) {
		log.debug("getting Processresponsibleroles instance with id: " + id);
		try {
			Processresponsibleroles instance = (Processresponsibleroles) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processresponsibleroles", id);
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

	public List<Processresponsibleroles> findByExample(Processresponsibleroles instance) {
		log.debug("finding Processresponsibleroles instance by example");
		try {
			List<Processresponsibleroles> results = (List<Processresponsibleroles>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processresponsibleroles").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
