package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDelete {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();// opening a session
		Transaction tr = session.beginTransaction();// begining a transaction

		// creating a new object of emp
		Employee s1 = session.get(Employee.class, 1);
		session.delete(s1);
		System.out.println("data deleted successfully!!!!!!!!!");
		
		tr.commit();
		System.out.println("data deleted sucessfully!!!!!!!!!");

		// tr.rollback();
		session.close();
		System.out.println("data deleted sucessfully!!!!!!!!!");
	}
}
