package org.mphasis.exercise;

import java.util.Scanner;

public class FindPower {
	private static int toPower(int number, int power) {
		int pow = number;
		for (int i = 1; i < power; i++) {
			pow = pow * number;
		}
		return pow;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number : ");
		int number = sc.nextInt();
		System.out.println("Please Enter The Power : ");
		int power = sc.nextInt();
		System.out.println(toPower(number, power));
	}
}
