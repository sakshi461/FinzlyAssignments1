package com.commoncode;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Common {
	public Common()
	{
		
	}
	public static SessionFactory getSessionFactory() {

		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(com.entity.Book.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}

}
