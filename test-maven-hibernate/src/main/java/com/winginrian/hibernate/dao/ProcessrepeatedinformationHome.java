package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processrepeatedinformation;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processrepeatedinformation.
 * @see com.winginrian.hibernate.dao.Processrepeatedinformation
 * @author Hibernate Tools
 */
public class ProcessrepeatedinformationHome {

	private static final Log log = LogFactory.getLog(ProcessrepeatedinformationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processrepeatedinformation transientInstance) {
		log.debug("persisting Processrepeatedinformation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processrepeatedinformation instance) {
		log.debug("attaching dirty Processrepeatedinformation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processrepeatedinformation instance) {
		log.debug("attaching clean Processrepeatedinformation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processrepeatedinformation persistentInstance) {
		log.debug("deleting Processrepeatedinformation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processrepeatedinformation merge(Processrepeatedinformation detachedInstance) {
		log.debug("merging Processrepeatedinformation instance");
		try {
			Processrepeatedinformation result = (Processrepeatedinformation) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processrepeatedinformation findById(java.lang.Integer id) {
		log.debug("getting Processrepeatedinformation instance with id: " + id);
		try {
			Processrepeatedinformation instance = (Processrepeatedinformation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processrepeatedinformation", id);
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

	public List<Processrepeatedinformation> findByExample(Processrepeatedinformation instance) {
		log.debug("finding Processrepeatedinformation instance by example");
		try {
			List<Processrepeatedinformation> results = (List<Processrepeatedinformation>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Processrepeatedinformation")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
