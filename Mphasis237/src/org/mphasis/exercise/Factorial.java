package org.mphasis.exercise;

import java.util.Scanner;

public class Factorial {
	private static int  toFactorial(int a) {
		int fac = 1;
		for (int i = 1; i <= a; i++) {
			fac = fac * i;
		}
		return fac;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number : ");
		int a = sc.nextInt();
		System.out.println(toFactorial(a));
	}

}
