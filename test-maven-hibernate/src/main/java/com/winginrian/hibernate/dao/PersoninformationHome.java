package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Personinformation;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Personinformation.
 * @see com.winginrian.hibernate.dao.Personinformation
 * @author Hibernate Tools
 */
public class PersoninformationHome {

	private static final Log log = LogFactory.getLog(PersoninformationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Personinformation transientInstance) {
		log.debug("persisting Personinformation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Personinformation instance) {
		log.debug("attaching dirty Personinformation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Personinformation instance) {
		log.debug("attaching clean Personinformation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Personinformation persistentInstance) {
		log.debug("deleting Personinformation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Personinformation merge(Personinformation detachedInstance) {
		log.debug("merging Personinformation instance");
		try {
			Personinformation result = (Personinformation) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Personinformation findById(java.lang.Integer id) {
		log.debug("getting Personinformation instance with id: " + id);
		try {
			Personinformation instance = (Personinformation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Personinformation", id);
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

	public List<Personinformation> findByExample(Personinformation instance) {
		log.debug("finding Personinformation instance by example");
		try {
			List<Personinformation> results = (List<Personinformation>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Personinformation").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
