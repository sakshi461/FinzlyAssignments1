package com.javabysakshi.Employee;

public class Manager extends Employee{
private String department;

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public Manager(int id, String name, String department) {
	super(id, name);
	this.department = department;
}

public void displayInfo()
{
	System.out.println("The employee id is  "+getId()+" \n The name of the employee is  "+getName());

	System.out.println("The Manager is working in "+department+" Department");
	System.out.println("-------------------------------");
}

}
