package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateClient {
	public static void main(String args[]) {
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Emp.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session =sf.openSession();//opening a session
	Transaction tr=session.beginTransaction();//begining a transaction
	
	Emp emp =new Emp();
	emp.setId(1);
	emp.setName("Sumit");
	emp.setSalary("bahot sara paisa");
	
	session.update(emp);
	System.out.println("data updated successfully!!!!!!!!!!!");
	tr.commit();
	session.close();
}
}