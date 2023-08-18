package com.javabysakshi.OopsAllConcept;

public class MainAbstraction {
public static void main(String[] args) {
	Book b=new Book(100,"Science","Darwin");
	b.displayInfo();
	DVD d=new DVD(101,"fiction",10);
	d.displayInfo();

	System.out.println();
	System.out.println();
	
	LibraryItem l=new LibraryItem(101,"Magazine");
	l.displayInfo();
	StudentMember s=new StudentMember();
	s.borrowItem(l);
	
	
	}
}
