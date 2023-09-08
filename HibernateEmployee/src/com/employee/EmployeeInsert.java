package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeInsert {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();// opening a session
		Transaction tr = session.beginTransaction();// begining a transaction

		Employee e = new Employee();
		e.setEmpId(1);
		e.setFirstname("Sakshi");
		e.setLastname("Patel");
		e.setDob("04/04/2001");
		e.setEmail("sakshi@gmail.com");
		e.setDepartment("Developer");
		e.setSalary("100000");
		// saving a particular session
		session.save(e);
		Employee e1 = new Employee();
		e1.setEmpId(2);
		e1.setFirstname("RANI");
		e1.setLastname("patel");
		e1.setDob("04/04/2001");
		e1.setEmail("rani@gmail.com");
		e1.setDepartment("Tester");
		e1.setSalary("10000");
		session.save(e1);

		System.out.println("data saved successfully");
		tr.commit();
		session.close();
	}

}
