package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Caseprocess;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Caseprocess.
 * @see com.winginrian.hibernate.dao.Caseprocess
 * @author Hibernate Tools
 */
public class CaseprocessHome {

	private static final Log log = LogFactory.getLog(CaseprocessHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Caseprocess transientInstance) {
		log.debug("persisting Caseprocess instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Caseprocess instance) {
		log.debug("attaching dirty Caseprocess instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Caseprocess instance) {
		log.debug("attaching clean Caseprocess instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Caseprocess persistentInstance) {
		log.debug("deleting Caseprocess instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Caseprocess merge(Caseprocess detachedInstance) {
		log.debug("merging Caseprocess instance");
		try {
			Caseprocess result = (Caseprocess) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Caseprocess findById(java.lang.Integer id) {
		log.debug("getting Caseprocess instance with id: " + id);
		try {
			Caseprocess instance = (Caseprocess) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Caseprocess", id);
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

	public List<Caseprocess> findByExample(Caseprocess instance) {
		log.debug("finding Caseprocess instance by example");
		try {
			List<Caseprocess> results = (List<Caseprocess>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Caseprocess").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
