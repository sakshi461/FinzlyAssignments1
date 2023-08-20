package com.javabysakshi.Employee;

public class Developer extends Employee{
private String programminglanguage;

public String getProgramminglanguage() {
	return programminglanguage;
}

public void setProgramminglanguage(String programminglanguage) {
	this.programminglanguage = programminglanguage;
}

public Developer(int id, String name,String programminglanguage) {
	super(id,name);
	this.programminglanguage = programminglanguage;
}
public void displayInfo()
{
	System.out.println("The employee id is  "+getId()+"\n The name of the employee is  "+getName());
	System.out.println("Developer is working on "+programminglanguage+" Language");
	System.out.println("-------------------------------");

}
}
