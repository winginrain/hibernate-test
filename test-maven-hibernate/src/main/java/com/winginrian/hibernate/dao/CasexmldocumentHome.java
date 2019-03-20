package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Casexmldocument;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Casexmldocument.
 * @see com.winginrian.hibernate.dao.Casexmldocument
 * @author Hibernate Tools
 */
public class CasexmldocumentHome {

	private static final Log log = LogFactory.getLog(CasexmldocumentHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Casexmldocument transientInstance) {
		log.debug("persisting Casexmldocument instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Casexmldocument instance) {
		log.debug("attaching dirty Casexmldocument instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Casexmldocument instance) {
		log.debug("attaching clean Casexmldocument instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Casexmldocument persistentInstance) {
		log.debug("deleting Casexmldocument instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Casexmldocument merge(Casexmldocument detachedInstance) {
		log.debug("merging Casexmldocument instance");
		try {
			Casexmldocument result = (Casexmldocument) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Casexmldocument findById(java.lang.Integer id) {
		log.debug("getting Casexmldocument instance with id: " + id);
		try {
			Casexmldocument instance = (Casexmldocument) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Casexmldocument", id);
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

	public List<Casexmldocument> findByExample(Casexmldocument instance) {
		log.debug("finding Casexmldocument instance by example");
		try {
			List<Casexmldocument> results = (List<Casexmldocument>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Casexmldocument").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
