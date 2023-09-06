package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadClient {
	public static void main(String args[]) {
	Configuration cfg =new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Emp.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session =sf.openSession();//opening a session
	Transaction tr=session.beginTransaction();//begining a transaction
	
	Emp emp =session.load(Emp.class, 1);
	System.out.println(emp);
	tr.commit();
	session.close();
}
}
