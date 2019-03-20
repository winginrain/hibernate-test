package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processparticipant;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processparticipant.
 * @see com.winginrian.hibernate.dao.Processparticipant
 * @author Hibernate Tools
 */
public class ProcessparticipantHome {

	private static final Log log = LogFactory.getLog(ProcessparticipantHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processparticipant transientInstance) {
		log.debug("persisting Processparticipant instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processparticipant instance) {
		log.debug("attaching dirty Processparticipant instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processparticipant instance) {
		log.debug("attaching clean Processparticipant instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processparticipant persistentInstance) {
		log.debug("deleting Processparticipant instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processparticipant merge(Processparticipant detachedInstance) {
		log.debug("merging Processparticipant instance");
		try {
			Processparticipant result = (Processparticipant) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processparticipant findById(java.lang.Integer id) {
		log.debug("getting Processparticipant instance with id: " + id);
		try {
			Processparticipant instance = (Processparticipant) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processparticipant", id);
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

	public List<Processparticipant> findByExample(Processparticipant instance) {
		log.debug("finding Processparticipant instance by example");
		try {
			List<Processparticipant> results = (List<Processparticipant>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processparticipant").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
