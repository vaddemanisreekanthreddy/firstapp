package org.mphasis.exercise;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number : ");
		int rows = sc.nextInt();
		toPrint(rows);
	}

	private static void toPrint(int rows) {
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if(i==1 || j==1||j==rows||i==rows)
					System.out.print("* ");
			else	
				System.out.print("   ");
			}
			System.out.println();
		}
		}
	}
