package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Customapplicationinformation;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Customapplicationinformation.
 * @see com.winginrian.hibernate.dao.Customapplicationinformation
 * @author Hibernate Tools
 */
public class CustomapplicationinformationHome {

	private static final Log log = LogFactory.getLog(CustomapplicationinformationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Customapplicationinformation transientInstance) {
		log.debug("persisting Customapplicationinformation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Customapplicationinformation instance) {
		log.debug("attaching dirty Customapplicationinformation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Customapplicationinformation instance) {
		log.debug("attaching clean Customapplicationinformation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Customapplicationinformation persistentInstance) {
		log.debug("deleting Customapplicationinformation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Customapplicationinformation merge(Customapplicationinformation detachedInstance) {
		log.debug("merging Customapplicationinformation instance");
		try {
			Customapplicationinformation result = (Customapplicationinformation) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Customapplicationinformation findById(java.lang.Integer id) {
		log.debug("getting Customapplicationinformation instance with id: " + id);
		try {
			Customapplicationinformation instance = (Customapplicationinformation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Customapplicationinformation", id);
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

	public List<Customapplicationinformation> findByExample(Customapplicationinformation instance) {
		log.debug("finding Customapplicationinformation instance by example");
		try {
			List<Customapplicationinformation> results = (List<Customapplicationinformation>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Customapplicationinformation")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
