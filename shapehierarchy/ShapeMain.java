package com.javabysakshi.shapehierarchy;

public class ShapeMain {
	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		 System.out.println(c.calculateArea());
		 System.out.println(c.calculatePerimeter());
		 
		 Triangle t=new Triangle(7,5);
		 Triangle t1=new Triangle (2,3,4);
		System.out.println( t.calculateArea());
		System.out.println(t1.calculatePerimeter());
		 
		 Rectangle r=new Rectangle(23,5);
		System.out.println(r.calculateArea());
		System.out.println(r.calculatePerimeter());
		 
	}
 
 
}
