package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processevent;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processevent.
 * @see com.winginrian.hibernate.dao.Processevent
 * @author Hibernate Tools
 */
public class ProcesseventHome {

	private static final Log log = LogFactory.getLog(ProcesseventHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processevent transientInstance) {
		log.debug("persisting Processevent instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processevent instance) {
		log.debug("attaching dirty Processevent instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processevent instance) {
		log.debug("attaching clean Processevent instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processevent persistentInstance) {
		log.debug("deleting Processevent instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processevent merge(Processevent detachedInstance) {
		log.debug("merging Processevent instance");
		try {
			Processevent result = (Processevent) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processevent findById(java.lang.Integer id) {
		log.debug("getting Processevent instance with id: " + id);
		try {
			Processevent instance = (Processevent) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processevent", id);
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

	public List<Processevent> findByExample(Processevent instance) {
		log.debug("finding Processevent instance by example");
		try {
			List<Processevent> results = (List<Processevent>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processevent").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
