package com.wordmaster.service;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.wordmaster.po.WordType;

public class WordTypeManager
{
	public static void main(String[] args)
		throws Exception
	{
		//ʵ����Configuration��
		Configuration conf = new Configuration()
		//���淽��Ĭ�ϼ���hibernate.cfg.xml�ļ�
			.configure();
		//��Configuration����SessionFactory
		SessionFactory sf = conf.buildSessionFactory();
		//����Session
		Session sess = sf.openSession();
		//��ʼ����
		Transaction tx = sess.beginTransaction();
		//������Ϣʵ��
		WordType wordType = new WordType();
		wordType.setCode("v");
		wordType.setDescription("Verb");
		sess.save(wordType);
		//�ύ����
		tx.commit();
		//�ر�Session
		sess.close();
		sf.close();
	}
}
