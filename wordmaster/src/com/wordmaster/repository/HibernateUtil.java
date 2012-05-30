package com.wordmaster.repository;

import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * Description:
 * <br/><a href="http://www.crazyit.org"></a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */	
public class HibernateUtil
{
	public static final SessionFactory sessionFactory;
	
	static
	{
		try
		{
			Configuration configuration = new Configuration()
				.configure();
			sessionFactory = configuration.buildSessionFactory();
		}
		catch (Throwable ex)
		{
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	//ThreadLocal
	public static final ThreadLocal<Session> session
		= new ThreadLocal<Session>();
	
	public static Session currentSession()
		throws HibernateException
	{
		Session s = session.get();
		if (s == null)
		{
			s = sessionFactory.openSession();
			session.set(s);
		}
		return s;
	}
	
	public static void closeSession()
		throws HibernateException 
	{
		Session s = session.get();
		if (s != null)
			s.close();
		session.set(null);
	}
}