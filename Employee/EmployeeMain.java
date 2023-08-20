package com.javabysakshi.Employee;

public class EmployeeMain {
public static void main(String[] args) {
	Manager m=new Manager(10001,"Sakshi ","Developer");
	m.displayInfo();
	Developer d=new Developer(10002,"Rani","Java");
	d.displayInfo();
}
}
