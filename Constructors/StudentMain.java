package com.javabysakshi.Constructors;

public class StudentMain {
 
	public static void main(String[] args) {
		
	
	Student s =new Student();
	s.displayInfo();
	Student s1=new Student("sakshi",22,10001);
	s1.displayInfo();
	Student   s2=new Student("Sumit",22);
	s2.displayInfo();
	}
}
