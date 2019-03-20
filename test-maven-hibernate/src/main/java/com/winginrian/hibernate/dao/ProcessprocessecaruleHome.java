package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processprocessecarule;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processprocessecarule.
 * @see com.winginrian.hibernate.dao.Processprocessecarule
 * @author Hibernate Tools
 */
public class ProcessprocessecaruleHome {

	private static final Log log = LogFactory.getLog(ProcessprocessecaruleHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processprocessecarule transientInstance) {
		log.debug("persisting Processprocessecarule instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processprocessecarule instance) {
		log.debug("attaching dirty Processprocessecarule instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processprocessecarule instance) {
		log.debug("attaching clean Processprocessecarule instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processprocessecarule persistentInstance) {
		log.debug("deleting Processprocessecarule instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processprocessecarule merge(Processprocessecarule detachedInstance) {
		log.debug("merging Processprocessecarule instance");
		try {
			Processprocessecarule result = (Processprocessecarule) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processprocessecarule findById(java.lang.Integer id) {
		log.debug("getting Processprocessecarule instance with id: " + id);
		try {
			Processprocessecarule instance = (Processprocessecarule) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processprocessecarule", id);
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

	public List<Processprocessecarule> findByExample(Processprocessecarule instance) {
		log.debug("finding Processprocessecarule instance by example");
		try {
			List<Processprocessecarule> results = (List<Processprocessecarule>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processprocessecarule").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
