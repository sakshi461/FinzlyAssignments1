package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.commoncode.Common;
import com.entity.Book;

public class AllBook {
	public static void main(String[] args) {

		SessionFactory sf =Common.getSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("All books currently available in the library");
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> list = criteria.list();
		for (Book emp : list) {
			System.out.println(emp);
		}
		
	}


}
