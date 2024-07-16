package org.mphasis.practice;

import java.util.Scanner;

public class febu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int n1 = 0, n2 = 1;
		int count = 2;
		int sum = 0;
		while (true) {
			int n3 = n1 + n2;
			if (count % 2 == 0) {
				sum = sum + n3;
				number--;
			}
			count++;
			n1 = n2;
			n2 = n3;
			if (number == 0)
				break;
		}
		System.out.println("the Sum of Even Numbers are : " + sum);
	}

}
