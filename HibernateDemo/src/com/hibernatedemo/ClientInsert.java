package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientInsert {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Emp.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session =sf.openSession();//opening a session
	Transaction tr=session.beginTransaction();//begining a transaction
	
	Emp e=new Emp();
	e.setId(2);
	e.setName("Rani");
	e.setSalary("100000");
	//saving a particular session
	session.save(e);
	System.out.println("data saved successfully");
	tr.commit();
	session.close();
	}
}
