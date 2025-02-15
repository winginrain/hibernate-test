package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processwebserviceoutputmapping;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processwebserviceoutputmapping.
 * @see com.winginrian.hibernate.dao.Processwebserviceoutputmapping
 * @author Hibernate Tools
 */
public class ProcesswebserviceoutputmappingHome {

	private static final Log log = LogFactory.getLog(ProcesswebserviceoutputmappingHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processwebserviceoutputmapping transientInstance) {
		log.debug("persisting Processwebserviceoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processwebserviceoutputmapping instance) {
		log.debug("attaching dirty Processwebserviceoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processwebserviceoutputmapping instance) {
		log.debug("attaching clean Processwebserviceoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processwebserviceoutputmapping persistentInstance) {
		log.debug("deleting Processwebserviceoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processwebserviceoutputmapping merge(Processwebserviceoutputmapping detachedInstance) {
		log.debug("merging Processwebserviceoutputmapping instance");
		try {
			Processwebserviceoutputmapping result = (Processwebserviceoutputmapping) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processwebserviceoutputmapping findById(java.lang.Integer id) {
		log.debug("getting Processwebserviceoutputmapping instance with id: " + id);
		try {
			Processwebserviceoutputmapping instance = (Processwebserviceoutputmapping) sessionFactory
					.getCurrentSession().get("com.winginrian.hibernate.dao.Processwebserviceoutputmapping", id);
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

	public List<Processwebserviceoutputmapping> findByExample(Processwebserviceoutputmapping instance) {
		log.debug("finding Processwebserviceoutputmapping instance by example");
		try {
			List<Processwebserviceoutputmapping> results = (List<Processwebserviceoutputmapping>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Processwebserviceoutputmapping")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
