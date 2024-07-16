package org.mphasis.practice;

import java.util.*;

public class PrimeNumbers {
	private static void primeNumbers(int range) {
		for (int i = 2; i <= range; i++) {
			if (isPrime(i))
				System.out.println(i);
		}
	}
	static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int range = sc.nextInt();
		primeNumbers(range);

	}
}
