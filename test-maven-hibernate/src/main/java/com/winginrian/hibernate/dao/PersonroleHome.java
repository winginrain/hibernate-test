package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Personrole;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Personrole.
 * @see com.winginrian.hibernate.dao.Personrole
 * @author Hibernate Tools
 */
public class PersonroleHome {

	private static final Log log = LogFactory.getLog(PersonroleHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Personrole transientInstance) {
		log.debug("persisting Personrole instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Personrole instance) {
		log.debug("attaching dirty Personrole instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Personrole instance) {
		log.debug("attaching clean Personrole instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Personrole persistentInstance) {
		log.debug("deleting Personrole instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Personrole merge(Personrole detachedInstance) {
		log.debug("merging Personrole instance");
		try {
			Personrole result = (Personrole) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Personrole findById(java.lang.Integer id) {
		log.debug("getting Personrole instance with id: " + id);
		try {
			Personrole instance = (Personrole) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Personrole", id);
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

	public List<Personrole> findByExample(Personrole instance) {
		log.debug("finding Personrole instance by example");
		try {
			List<Personrole> results = (List<Personrole>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Personrole").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
