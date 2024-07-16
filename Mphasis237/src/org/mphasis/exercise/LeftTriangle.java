package org.mphasis.exercise;

import java.util.Iterator;
import java.util.Scanner;

public class LeftTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number : ");
		int rows = sc.nextInt();
		toPrint(rows);
	}

	private static void toPrint(int rows) {
		int space = rows-1;
		int star=1;
		for (int i = 1; i <= rows; i++) {
			for (int k = 0; k < space; k++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			star++;
			space--;
			System.out.println();
		}
	}
}
