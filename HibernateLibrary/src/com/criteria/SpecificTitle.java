package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.commoncode.Common;
import com.entity.Book;

public class SpecificTitle {

	public static void main(String[] args) {

		SessionFactory sf = Common.getSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("books with a specific title or containing specific keywords in the title");

		Criteria criteria = session.createCriteria(Book.class);
		criteria.add(Restrictions.like("title", "java"));
		List<Book> list = criteria.list();
		for (Book emp : list) {
			System.out.println(emp);
		}
	}

}
