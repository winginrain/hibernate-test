package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowinformation;

/**
 * Home object for domain model class Workflowinformation.
 * @see com.winginrian.hibernate.dao.Workflowinformation
 * @author Hibernate Tools
 */
public class WorkflowinformationHome {

	private static final Log log = LogFactory.getLog(WorkflowinformationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowinformation transientInstance) {
		log.debug("persisting Workflowinformation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowinformation instance) {
		log.debug("attaching dirty Workflowinformation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowinformation instance) {
		log.debug("attaching clean Workflowinformation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowinformation persistentInstance) {
		log.debug("deleting Workflowinformation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowinformation merge(Workflowinformation detachedInstance) {
		log.debug("merging Workflowinformation instance");
		try {
			Workflowinformation result = (Workflowinformation) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowinformation findById(java.lang.Integer id) {
		log.debug("getting Workflowinformation instance with id: " + id);
		try {
			Workflowinformation instance = (Workflowinformation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowinformation", id);
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

	public List<Workflowinformation> findByExample(Workflowinformation instance) {
		log.debug("finding Workflowinformation instance by example");
		try {
			List<Workflowinformation> results = (List<Workflowinformation>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowinformation").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
