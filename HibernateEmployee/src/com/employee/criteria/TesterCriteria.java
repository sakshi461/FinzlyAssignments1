package com.employee.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.employee.Employee;

public class TesterCriteria {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();// opening a session

		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.ne("department", "tester"));
		List<Employee> list = criteria.list();
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}
}
