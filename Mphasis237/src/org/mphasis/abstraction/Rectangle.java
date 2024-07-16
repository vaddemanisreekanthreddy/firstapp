package org.mphasis.abstraction;

public class Rectangle extends Shape {
	float length, breadth;

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void calculateArea() {
		double area = length * breadth;
		System.out.println("The Area of Rectangle is : " + area);
	}
}
