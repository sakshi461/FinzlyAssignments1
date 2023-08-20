package com.javabysakshi.Vehicle;

public class Car implements Vehicle{
private int speed;

	public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

	public Car(int speed) {
	super();
	this.speed = speed;
}

	@Override
	public void start() {
		System.out.println("Starting car engine!!!!!");
	}

	@Override
	public void accelerate(int a) {
	speed=speed+a;
	System.out.println("car's speed increasing speed is at "+speed+"kmph");
	}

	@Override
	public void brake(int a) {
     speed=speed-a;	
 	System.out.println("car's speed decreasing car is at "+speed+"kmph");

	}
 
}
