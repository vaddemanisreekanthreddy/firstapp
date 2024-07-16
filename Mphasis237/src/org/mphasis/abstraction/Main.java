package org.mphasis.abstraction;

public class Main {
	public static void main(String[] args) {
		System.out.println("--------------------CIRCLE------------------------");
		Circle c = new Circle(10);
		c.calculateArea();

		System.out.println("--------------------RECTANGLE------------------------");
		Rectangle rc = new Rectangle(10, 20);
		rc.calculateArea();
		
		System.out.println("--------------------TRIANGLE------------------------");
		Triangle tr = new Triangle(13, 15);
		tr.calculateArea();
	}
}
