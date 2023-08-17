package com.javabysakshi.TestAnswers1;

class Animal{
	private int age;
	private String name;
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public void makeSound()
	{
		System.out.println("this is from animal class!!!!! makesound method is called");
	}
}
class Lion extends Animal{
	
	public Lion(int age, String name) {
		super(age, name);
	}

	public void makeSound()
	{
		System.out.println("this is from Lion class!!!!! makesound method is called");

	}
}
class Elephant extends Animal{

	public Elephant(int age, String name) {
		super(age, name);
			}
	public void makeSound()
	{
		System.out.println("This is  from Elephant class and makesound method is called");
	}
	
}

class Giraffe extends Animal{

	public Giraffe(int age, String name) {
		super(age, name);
	}
	public void makeSound(){
		System.out.println("This is  from giraffe class  and make sound is called");
	}
}

public class ZooClass {
public static void main(String[] args) {
	Animal a=new Animal(12,"elephant");
	a.makeSound();
	
	Animal l=new Lion(10,"Ramu lion");
	l.makeSound();
	
	Animal e=new Elephant(14,"moti");
	e.makeSound();
	
	Animal g=new Giraffe(12,"girru");
	g.makeSound();
}
}
