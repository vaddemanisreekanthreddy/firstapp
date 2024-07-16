package org.mphasis.practice;

import java.util.*;

public class MathamaticalOperation {

	static void result(int n1, int n2, char ch) {
		if (ch == '+')
			System.out.println("The Sum is  " + (n1 + n2));
		else if (ch == '-')
			System.out.println("The Difference is  " + (n1 - n2));
		else if (ch == '*')
			System.out.println("The Multiplication is  " + n1 * n2);
		else if (ch == '/')
			System.out.println("The Division is  " + n1 % n2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int n2 = sc.nextInt();
		System.out.println("Enter Mathamatical Operator");
		char ch = sc.next().charAt(0);
		result(n1, n2, ch);

	}

}
