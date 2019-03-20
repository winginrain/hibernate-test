package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Caseobject;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Caseobject.
 * @see com.winginrian.hibernate.dao.Caseobject
 * @author Hibernate Tools
 */
public class CaseobjectHome {

	private static final Log log = LogFactory.getLog(CaseobjectHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Caseobject transientInstance) {
		log.debug("persisting Caseobject instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Caseobject instance) {
		log.debug("attaching dirty Caseobject instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Caseobject instance) {
		log.debug("attaching clean Caseobject instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Caseobject persistentInstance) {
		log.debug("deleting Caseobject instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Caseobject merge(Caseobject detachedInstance) {
		log.debug("merging Caseobject instance");
		try {
			Caseobject result = (Caseobject) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Caseobject findById(java.lang.Integer id) {
		log.debug("getting Caseobject instance with id: " + id);
		try {
			Caseobject instance = (Caseobject) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Caseobject", id);
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

	public List<Caseobject> findByExample(Caseobject instance) {
		log.debug("finding Caseobject instance by example");
		try {
			List<Caseobject> results = (List<Caseobject>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Caseobject").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
