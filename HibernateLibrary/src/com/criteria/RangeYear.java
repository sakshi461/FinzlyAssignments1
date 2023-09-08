package com.criteria;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.commoncode.Common;
import com.entity.Book;

public class RangeYear {
	public static void main(String[] args) {

		SessionFactory sf =Common.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Book.class);
		criteria.add(Restrictions.between("pubyear", "2000","3000"));
		List<Book> list = criteria.list();
		for (Book emp : list) {
			System.out.println(emp);
		}
	
		System.out.println(" Books published within a certain range of years...");
	}


}
