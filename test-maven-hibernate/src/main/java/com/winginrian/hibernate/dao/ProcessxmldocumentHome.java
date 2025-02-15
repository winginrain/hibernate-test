package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processxmldocument;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processxmldocument.
 * @see com.winginrian.hibernate.dao.Processxmldocument
 * @author Hibernate Tools
 */
public class ProcessxmldocumentHome {

	private static final Log log = LogFactory.getLog(ProcessxmldocumentHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processxmldocument transientInstance) {
		log.debug("persisting Processxmldocument instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processxmldocument instance) {
		log.debug("attaching dirty Processxmldocument instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processxmldocument instance) {
		log.debug("attaching clean Processxmldocument instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processxmldocument persistentInstance) {
		log.debug("deleting Processxmldocument instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processxmldocument merge(Processxmldocument detachedInstance) {
		log.debug("merging Processxmldocument instance");
		try {
			Processxmldocument result = (Processxmldocument) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processxmldocument findById(java.lang.Integer id) {
		log.debug("getting Processxmldocument instance with id: " + id);
		try {
			Processxmldocument instance = (Processxmldocument) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processxmldocument", id);
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

	public List<Processxmldocument> findByExample(Processxmldocument instance) {
		log.debug("finding Processxmldocument instance by example");
		try {
			List<Processxmldocument> results = (List<Processxmldocument>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processxmldocument").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
