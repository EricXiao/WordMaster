package com.wordmaster.service;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.wordmaster.po.WordType;

public class WordTypeManager
{
	public static void main(String[] args)
		throws Exception
	{
		//实例化Configuration，
		Configuration conf = new Configuration()
		//下面方法默认加载hibernate.cfg.xml文件
			.configure();
		//以Configuration创建SessionFactory
		SessionFactory sf = conf.buildSessionFactory();
		//创建Session
		Session sess = sf.openSession();
		//开始事务
		Transaction tx = sess.beginTransaction();
		//创建消息实例
		WordType wordType = new WordType();
		wordType.setCode("v");
		wordType.setDescription("Verb");
		sess.save(wordType);
		//提交事务
		tx.commit();
		//关闭Session
		sess.close();
		sf.close();
	}
}
