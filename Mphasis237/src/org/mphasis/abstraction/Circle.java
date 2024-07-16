package org.mphasis.abstraction;

public class Circle extends Shape {
     float radius;
     
     
	public Circle(float radius) {
		super();
		this.radius = radius;
	}


	@Override
	void calculateArea() {
		double area = 3.14 * radius * radius;
		System.out.println("The Area of Triangle is : "+area);
	}

}
