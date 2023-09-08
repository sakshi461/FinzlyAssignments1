package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.commoncode.Common;
import com.entity.Book;

public class SpecificISBN {
	public static void main(String[] args) {

		SessionFactory sf = Common.getSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("Books with a specific ISBN number");

		Criteria criteria = session.createCriteria(Book.class);
		criteria.add(Restrictions.like("ISBN", "87-476"));
		List<Book> list = criteria.list();
		for (Book emp : list) {
			System.out.println(emp);
		}
	}
}
