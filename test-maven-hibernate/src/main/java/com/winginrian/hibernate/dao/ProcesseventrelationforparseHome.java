package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processeventrelationforparse;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processeventrelationforparse.
 * @see com.winginrian.hibernate.dao.Processeventrelationforparse
 * @author Hibernate Tools
 */
public class ProcesseventrelationforparseHome {

	private static final Log log = LogFactory.getLog(ProcesseventrelationforparseHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processeventrelationforparse transientInstance) {
		log.debug("persisting Processeventrelationforparse instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processeventrelationforparse instance) {
		log.debug("attaching dirty Processeventrelationforparse instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processeventrelationforparse instance) {
		log.debug("attaching clean Processeventrelationforparse instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processeventrelationforparse persistentInstance) {
		log.debug("deleting Processeventrelationforparse instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processeventrelationforparse merge(Processeventrelationforparse detachedInstance) {
		log.debug("merging Processeventrelationforparse instance");
		try {
			Processeventrelationforparse result = (Processeventrelationforparse) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processeventrelationforparse findById(java.lang.Integer id) {
		log.debug("getting Processeventrelationforparse instance with id: " + id);
		try {
			Processeventrelationforparse instance = (Processeventrelationforparse) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processeventrelationforparse", id);
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

	public List<Processeventrelationforparse> findByExample(Processeventrelationforparse instance) {
		log.debug("finding Processeventrelationforparse instance by example");
		try {
			List<Processeventrelationforparse> results = (List<Processeventrelationforparse>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Processeventrelationforparse")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
