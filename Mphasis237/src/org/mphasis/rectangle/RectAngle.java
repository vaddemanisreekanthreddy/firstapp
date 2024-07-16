package org.mphasis.rectangle;

public class RectAngle {

	double length, breadth;
	double area;

	public RectAngle() {
		this.length = 0;
		this.breadth = 0;

	}

	public RectAngle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	void calculateArea() {
		area=length*breadth;
	}

	void toDisplay() {
		System.out.println("------------------RECTANGLE-----------------");
		System.out.println("Length of  Rectangle : "+length);
		System.out.println("breadth of  Rectangle : "+breadth);
		System.out.println("Area of  Rectangle : "+area);


	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	

}
