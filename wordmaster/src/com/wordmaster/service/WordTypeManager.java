package com.wordmaster.service;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.wordmaster.po.WordType;

public class WordTypeManager
{
	public static void main(String[] args)
		throws Exception
	{
		Configuration conf = new Configuration()
			.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		WordType wordType = new WordType();
		wordType.setCode("v");
		wordType.setDescription("Verb");
		sess.save(wordType);
		tx.commit();
		sess.close();
		sf.close();
	}
}
