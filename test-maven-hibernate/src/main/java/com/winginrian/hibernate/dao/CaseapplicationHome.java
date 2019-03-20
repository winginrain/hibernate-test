package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Caseapplication;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Caseapplication.
 * @see com.winginrian.hibernate.dao.Caseapplication
 * @author Hibernate Tools
 */
public class CaseapplicationHome {

	private static final Log log = LogFactory.getLog(CaseapplicationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Caseapplication transientInstance) {
		log.debug("persisting Caseapplication instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Caseapplication instance) {
		log.debug("attaching dirty Caseapplication instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Caseapplication instance) {
		log.debug("attaching clean Caseapplication instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Caseapplication persistentInstance) {
		log.debug("deleting Caseapplication instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Caseapplication merge(Caseapplication detachedInstance) {
		log.debug("merging Caseapplication instance");
		try {
			Caseapplication result = (Caseapplication) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Caseapplication findById(java.lang.Integer id) {
		log.debug("getting Caseapplication instance with id: " + id);
		try {
			Caseapplication instance = (Caseapplication) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Caseapplication", id);
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

	public List<Caseapplication> findByExample(Caseapplication instance) {
		log.debug("finding Caseapplication instance by example");
		try {
			List<Caseapplication> results = (List<Caseapplication>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Caseapplication").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
