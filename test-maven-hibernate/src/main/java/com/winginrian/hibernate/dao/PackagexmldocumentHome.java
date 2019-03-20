package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Packagexmldocument;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Packagexmldocument.
 * @see com.winginrian.hibernate.dao.Packagexmldocument
 * @author Hibernate Tools
 */
public class PackagexmldocumentHome {

	private static final Log log = LogFactory.getLog(PackagexmldocumentHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Packagexmldocument transientInstance) {
		log.debug("persisting Packagexmldocument instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Packagexmldocument instance) {
		log.debug("attaching dirty Packagexmldocument instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Packagexmldocument instance) {
		log.debug("attaching clean Packagexmldocument instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Packagexmldocument persistentInstance) {
		log.debug("deleting Packagexmldocument instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Packagexmldocument merge(Packagexmldocument detachedInstance) {
		log.debug("merging Packagexmldocument instance");
		try {
			Packagexmldocument result = (Packagexmldocument) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Packagexmldocument findById(java.lang.Integer id) {
		log.debug("getting Packagexmldocument instance with id: " + id);
		try {
			Packagexmldocument instance = (Packagexmldocument) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Packagexmldocument", id);
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

	public List<Packagexmldocument> findByExample(Packagexmldocument instance) {
		log.debug("finding Packagexmldocument instance by example");
		try {
			List<Packagexmldocument> results = (List<Packagexmldocument>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Packagexmldocument").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
