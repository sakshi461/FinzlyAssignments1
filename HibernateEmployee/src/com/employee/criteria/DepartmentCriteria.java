package com.employee.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.employee.Employee;

public class DepartmentCriteria {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();// opening a session

		Criteria criteria = session.createCriteria(Employee.class);
		Criterion c1 = Restrictions.like("department", "developer");
		Criterion c2 = Restrictions.like("department", "tester");
		
		LogicalExpression andExp = Restrictions.and(c1, c2);
		criteria.add( andExp );
		
		
		List<Employee> list = criteria.list();
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}
}
