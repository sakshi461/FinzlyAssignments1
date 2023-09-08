package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeUpdate {
	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();// opening a session
		Transaction tr = session.beginTransaction();// begining a transaction

		Employee e = session.get(Employee.class, 7);
//		Employee e =new Employee();
		e.setEmpId(7);
		e.setFirstname("Sumit");
		e.setSalary("bahot sara paisa");
		e.setLastname("Patel ");
		e.setDob("04/02/2001");
		e.setDepartment("Developer");
		e.setEmail("sumit@gmail.com");

//		

		session.update(e);
		System.out.println("data updated successfully!!!!!!!!!!!");
		tr.commit();
		session.close();
	}
}
