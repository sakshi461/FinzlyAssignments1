package com.javabysakshi.Constructors;

public class Student {
private String name;
private int age;
private int studentId;
public Student()
{
name="Unkonown";
age=0;
studentId=101;

}
public Student(String name,int age)
{
	this.studentId=100;
	this.name=name;
	this.age=age;
}
public Student(String name, int age, int studentId) {
	super();
	this.name = name;
	this.age = age;
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public void displayInfo()
{
	System.out.println("Student name - "+name+"  Student age is  "+age+"   Student Id is "+studentId);
}
}
