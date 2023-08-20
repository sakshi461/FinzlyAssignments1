package com.javabysakshi.Vehicle;

public class Play {
public static void main(String[] args) {
	Car c =new Car(80);
	c.start();
	c.accelerate(10);
	c.brake(10);
	
	MotorCycle m=new MotorCycle(50);
	m.start();
	m.accelerate(100);
	m.brake(40);
}
}
