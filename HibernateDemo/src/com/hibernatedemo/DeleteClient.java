package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteClient {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Emp.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session =sf.openSession();//opening a session
	Transaction tr=session.beginTransaction();//begining a transaction
	
	//creating a new object of emp 
	Emp e=new Emp();
	e.setId(1);
	e.setName("Ranu");
	e.setSalary("200000");
	session.delete(e);
	
	System.out.println("data deleted sucessfully!!!!!!!!!");
	tr.commit();
	session.close();
	
	
	
}
}
