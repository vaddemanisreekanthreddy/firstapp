package org.mphasis.practice;

import java.util.Scanner;

public class PerimeterOfRectAngle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Length of Rectangle : ");
		int length = sc.nextInt();
		System.out.println("Please Enter The Length of Rectangle : ");
		int breadth = sc.nextInt();
		int perimeter = 2 * (length + breadth);
		System.out.println(" The Perimeter of a Rectangle is : " + perimeter);
	}
}
