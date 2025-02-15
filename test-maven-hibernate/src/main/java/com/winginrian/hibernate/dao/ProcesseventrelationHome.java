package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processeventrelation;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processeventrelation.
 * @see com.winginrian.hibernate.dao.Processeventrelation
 * @author Hibernate Tools
 */
public class ProcesseventrelationHome {

	private static final Log log = LogFactory.getLog(ProcesseventrelationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processeventrelation transientInstance) {
		log.debug("persisting Processeventrelation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processeventrelation instance) {
		log.debug("attaching dirty Processeventrelation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processeventrelation instance) {
		log.debug("attaching clean Processeventrelation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processeventrelation persistentInstance) {
		log.debug("deleting Processeventrelation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processeventrelation merge(Processeventrelation detachedInstance) {
		log.debug("merging Processeventrelation instance");
		try {
			Processeventrelation result = (Processeventrelation) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processeventrelation findById(java.lang.Integer id) {
		log.debug("getting Processeventrelation instance with id: " + id);
		try {
			Processeventrelation instance = (Processeventrelation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processeventrelation", id);
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

	public List<Processeventrelation> findByExample(Processeventrelation instance) {
		log.debug("finding Processeventrelation instance by example");
		try {
			List<Processeventrelation> results = (List<Processeventrelation>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processeventrelation").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
