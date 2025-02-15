package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Caseperson;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Caseperson.
 * @see com.winginrian.hibernate.dao.Caseperson
 * @author Hibernate Tools
 */
public class CasepersonHome {

	private static final Log log = LogFactory.getLog(CasepersonHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Caseperson transientInstance) {
		log.debug("persisting Caseperson instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Caseperson instance) {
		log.debug("attaching dirty Caseperson instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Caseperson instance) {
		log.debug("attaching clean Caseperson instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Caseperson persistentInstance) {
		log.debug("deleting Caseperson instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Caseperson merge(Caseperson detachedInstance) {
		log.debug("merging Caseperson instance");
		try {
			Caseperson result = (Caseperson) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Caseperson findById(java.lang.Integer id) {
		log.debug("getting Caseperson instance with id: " + id);
		try {
			Caseperson instance = (Caseperson) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Caseperson", id);
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

	public List<Caseperson> findByExample(Caseperson instance) {
		log.debug("finding Caseperson instance by example");
		try {
			List<Caseperson> results = (List<Caseperson>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Caseperson").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
