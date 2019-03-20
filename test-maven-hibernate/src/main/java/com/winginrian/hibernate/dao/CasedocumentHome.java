package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Casedocument;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Casedocument.
 * @see com.winginrian.hibernate.dao.Casedocument
 * @author Hibernate Tools
 */
public class CasedocumentHome {

	private static final Log log = LogFactory.getLog(CasedocumentHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Casedocument transientInstance) {
		log.debug("persisting Casedocument instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Casedocument instance) {
		log.debug("attaching dirty Casedocument instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Casedocument instance) {
		log.debug("attaching clean Casedocument instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Casedocument persistentInstance) {
		log.debug("deleting Casedocument instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Casedocument merge(Casedocument detachedInstance) {
		log.debug("merging Casedocument instance");
		try {
			Casedocument result = (Casedocument) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Casedocument findById(java.lang.Integer id) {
		log.debug("getting Casedocument instance with id: " + id);
		try {
			Casedocument instance = (Casedocument) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Casedocument", id);
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

	public List<Casedocument> findByExample(Casedocument instance) {
		log.debug("finding Casedocument instance by example");
		try {
			List<Casedocument> results = (List<Casedocument>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Casedocument").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
