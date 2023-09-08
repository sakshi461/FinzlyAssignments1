package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmployeeRead {
	public static void main(String args[]) {
		Configuration cfg =new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session =sf.openSession();//opening a session
		Transaction tr=session.beginTransaction();//begining a transaction
		System.out.println("read");

		Employee emp =session.load(Employee.class,1);
		System.out.println("read");

		System.out.println(emp);
		System.out.println("read");
		tr.commit();
		session.close();
	}
}
