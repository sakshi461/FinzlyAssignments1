package com.javabysakshi.TestAnswers1;
class Student {
private int studentId;
private String name;
private static int totalStudent;

public Student(int studentId, String name) {
	//super();
	totalStudent=0;
	this.studentId = studentId;
	this.name = name;
}

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public static int getTotalStudent() {
	return totalStudent;
}

public static void setTotalStudent(int totalStudent) {
	Student.totalStudent = totalStudent;
}
public void enroll(Student Student){
	
	totalStudent+=1;
	System.out.println("enrolled sucessfully!!!!!");
}
public void drop(Student student)
{
	totalStudent-=1;
	System.out.println("Dropped student successsfully!!!!!!");
student =null;

}

	public static void main(String args[])
	{
	Student s =new Student(1,"Rani");
	s.enroll(s);
	s.drop(s);
	Student s1=new Student(1,"Sumit");
	s.enroll(s1);
//	s.drop(s1);
	}
}
