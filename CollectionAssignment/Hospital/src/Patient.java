
public class Patient {
private String name;
private int age;
private int id ;
public String getName() {
	return name;
}

public Patient()
{
	
}
public Patient(String name, int age, int id) {
	super();
	this.name = name;
	this.age = age;
	this.id = id;
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
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Patient [name=" + name + ", age=" + age + ", id=" + id + "]";
}

}
