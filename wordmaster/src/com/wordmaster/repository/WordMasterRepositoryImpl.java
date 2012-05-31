package com.wordmaster.repository;

import java.util.List;
import java.util.Set;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.wordmaster.po.WordExample;
import com.wordmaster.po.WordItem;
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
	public void saveAndCommit(Object po) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		session.save(po);
		tx.commit();
	}

	@Override
	public WordType findWordTypeByCode(String code) {
		Session session = HibernateUtil.currentSession();
		List<WordType> results = session.createCriteria(WordType.class).add(Restrictions.eq("code", code)).list();
		if(results.size()==0){
			return null;
		}
		return results.get(0);
	}

	@Override
	public void saveWordItem(WordItem wordItem) {
//		Set<WordExample> examples = wordItem.getExamples();
//		wordItem.setExamples(null);
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		session.save(wordItem);
//		for (WordExample example : examples) {
//			example.setWordItem(wordItem);
//			session.persist(example);
//		}
		tx.commit();
	}

}
