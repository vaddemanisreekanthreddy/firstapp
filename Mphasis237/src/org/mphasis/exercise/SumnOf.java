package org.mphasis.exercise;

import java.util.Scanner;

public class SumnOf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			System.err.println(a+" or A is the Greater");
		} else if (a < b) {
			System.err.println(b+" or B is the Greater");
		} else {
			System.err.println("Both are Equal");
		}
	}
}
