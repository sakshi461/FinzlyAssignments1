package com.javabysakshi.shapehierarchy;

public class Triangle implements Shape{
private int base;
private int height;
private int side1,side2,side3;
	
	public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getSide1() {
	return side1;
}
public void setSide1(int side1) {
	this.side1 = side1;
}
public int getSide2() {
	return side2;
}
public void setSide2(int side2) {
	this.side2 = side2;
}
public int getSide3() {
	return side3;
}
public void setSide3(int side3) {
	this.side3 = side3;
}
	public Triangle(int base, int height) {
	super();
	this.base = base;
	this.height = height;
	}
	public Triangle(int side1,int side2,int side3)
	{
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
     }
	@Override
	public double calculateArea() {
		System.out.print("Area of Traingle is - ");
		return 0.5*base*height;
	}
	@Override
	public double calculatePerimeter() {
		System.out.print("Perimeter of Triangle - ");
		return side1+side2+side3;
	}
}
