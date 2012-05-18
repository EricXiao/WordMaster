package com.wordmaster.repository;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.Session;

import com.wordmaster.po.WordType;

public class WordMasterRepositoryImpl implements WordMasterRepository {

	@Override
	public List<WordType> findAllWordTypes() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		List<WordType> results = session.createCriteria(WordType.class).list();
		tx.commit();
		return results;
	}

	@Override
	public void save(Object po) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		session.save(po);
		tx.commit();
	}

}
