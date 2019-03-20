package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Caseobjectvariable;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Caseobjectvariable.
 * @see com.winginrian.hibernate.dao.Caseobjectvariable
 * @author Hibernate Tools
 */
public class CaseobjectvariableHome {

	private static final Log log = LogFactory.getLog(CaseobjectvariableHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Caseobjectvariable transientInstance) {
		log.debug("persisting Caseobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Caseobjectvariable instance) {
		log.debug("attaching dirty Caseobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Caseobjectvariable instance) {
		log.debug("attaching clean Caseobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Caseobjectvariable persistentInstance) {
		log.debug("deleting Caseobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Caseobjectvariable merge(Caseobjectvariable detachedInstance) {
		log.debug("merging Caseobjectvariable instance");
		try {
			Caseobjectvariable result = (Caseobjectvariable) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Caseobjectvariable findById(java.lang.Integer id) {
		log.debug("getting Caseobjectvariable instance with id: " + id);
		try {
			Caseobjectvariable instance = (Caseobjectvariable) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Caseobjectvariable", id);
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

	public List<Caseobjectvariable> findByExample(Caseobjectvariable instance) {
		log.debug("finding Caseobjectvariable instance by example");
		try {
			List<Caseobjectvariable> results = (List<Caseobjectvariable>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Caseobjectvariable").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
