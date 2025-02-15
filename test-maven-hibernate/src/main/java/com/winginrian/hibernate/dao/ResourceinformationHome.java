package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Resourceinformation;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Resourceinformation.
 * @see com.winginrian.hibernate.dao.Resourceinformation
 * @author Hibernate Tools
 */
public class ResourceinformationHome {

	private static final Log log = LogFactory.getLog(ResourceinformationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Resourceinformation transientInstance) {
		log.debug("persisting Resourceinformation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Resourceinformation instance) {
		log.debug("attaching dirty Resourceinformation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Resourceinformation instance) {
		log.debug("attaching clean Resourceinformation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Resourceinformation persistentInstance) {
		log.debug("deleting Resourceinformation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Resourceinformation merge(Resourceinformation detachedInstance) {
		log.debug("merging Resourceinformation instance");
		try {
			Resourceinformation result = (Resourceinformation) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Resourceinformation findById(java.lang.Integer id) {
		log.debug("getting Resourceinformation instance with id: " + id);
		try {
			Resourceinformation instance = (Resourceinformation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Resourceinformation", id);
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

	public List<Resourceinformation> findByExample(Resourceinformation instance) {
		log.debug("finding Resourceinformation instance by example");
		try {
			List<Resourceinformation> results = (List<Resourceinformation>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Resourceinformation").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
