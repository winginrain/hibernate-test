package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Systemapplicationinformation;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Systemapplicationinformation.
 * @see com.winginrian.hibernate.dao.Systemapplicationinformation
 * @author Hibernate Tools
 */
public class SystemapplicationinformationHome {

	private static final Log log = LogFactory.getLog(SystemapplicationinformationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Systemapplicationinformation transientInstance) {
		log.debug("persisting Systemapplicationinformation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Systemapplicationinformation instance) {
		log.debug("attaching dirty Systemapplicationinformation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Systemapplicationinformation instance) {
		log.debug("attaching clean Systemapplicationinformation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Systemapplicationinformation persistentInstance) {
		log.debug("deleting Systemapplicationinformation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Systemapplicationinformation merge(Systemapplicationinformation detachedInstance) {
		log.debug("merging Systemapplicationinformation instance");
		try {
			Systemapplicationinformation result = (Systemapplicationinformation) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Systemapplicationinformation findById(java.lang.Integer id) {
		log.debug("getting Systemapplicationinformation instance with id: " + id);
		try {
			Systemapplicationinformation instance = (Systemapplicationinformation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Systemapplicationinformation", id);
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

	public List<Systemapplicationinformation> findByExample(Systemapplicationinformation instance) {
		log.debug("finding Systemapplicationinformation instance by example");
		try {
			List<Systemapplicationinformation> results = (List<Systemapplicationinformation>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Systemapplicationinformation")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
