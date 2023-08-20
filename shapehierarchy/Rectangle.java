package com.javabysakshi.shapehierarchy;

public class Rectangle implements Shape{
    private	int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double calculateArea()
	{
		System.out.print("Area of Rectangle is -");
		return length*width;
	}
	public double calculatePerimeter()
	{
		System.out.print("Perimeter of Rectangle - ");
		return 2*(length+width);
	}

}
