package org.mphasis.exercise;

import java.util.Iterator;
import java.util.Scanner;

public class TrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number : ");
		int rows = sc.nextInt();
		toPrint(rows);
	}

	private static void toPrint(int rows) {
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
					System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
