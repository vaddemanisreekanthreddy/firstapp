package org.mphasis.abstraction;

public class Triangle extends Shape{
	float height, base;

	public Triangle(float height, float base) {
		super();
		this.height = height;
		this.base = base;
	}

	@Override
	void calculateArea() {
		double area=height*base/2;
		System.out.println("The Area of Triangle is : " + area);
	}

}
