
public class Employee {

String name;
int age;
int empId;
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

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public Employee()
{
	
}
public Employee(String name, int age, int empId) {
	super();
	this.name = name;
	this.age = age;
	
	this.empId = empId;
	
}
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", empId=" + empId + "]";
}

}
