package com.criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.commoncode.Common;
import com.entity.Book;

public class UpdateBook {
	public static void main(String[] args) {

		SessionFactory sf = Common.getSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Book b = new Book();
		b.setId(4);
		b.setTitle("query");
		b.setAuthor("yash");
		b.setPubyear("1989");
		b.setISBN("6776");
		
		session.update(b);
		tr.commit();
		System.out.println("Data updated successfully...");
	}

}
