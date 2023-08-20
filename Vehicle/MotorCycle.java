package com.javabysakshi.Vehicle;

public class MotorCycle implements Vehicle{

	public MotorCycle(int speed) {
		super();
		this.speed = speed;
	}

int speed;

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

@Override
public void start() {
	// TODO Auto-generated method stub
	System.out.println("Motorcycle engine Starting !!!!");		

}

@Override
public void accelerate(int a) {
	// TODO Auto-generated method stub
	speed+=a;
	System.out.println("Speed is at "+speed+"kmph");

}

@Override
public void brake(int a) {
	// TODO Auto-generated method stub
	speed-=a;
	System.out.println("Speed is at "+speed+"kmph");

}

}
