package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.commoncode.Common;
import com.entity.Book;

public class SpecificYear {
	public static void main(String[] args) {

		SessionFactory sf = Common.getSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("Books written by a specific author");

		Criteria criteria = session.createCriteria(Book.class);
		criteria.add(Restrictions.gt("author", "NAME"));
		List<Book> list = criteria.list();
		for (Book emp : list) {
			System.out.println(emp);
		}
		
	}

}
