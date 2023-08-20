package com.javabysakshi.shapehierarchy;
public  class Circle implements Shape {
 private int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

public Circle(int radius) {
	//super();
	this.radius = radius;
}

  public double calculatePerimeter()
 {
	 System.out.print("Perimeter of Circle :");
	  return 2*Math.PI*radius;
 }

@Override
public double calculateArea() {
	System.out.print("Area of Circle is :");
	// TODO Auto-generated method stub
	return Math.PI*radius*radius;
}

}
