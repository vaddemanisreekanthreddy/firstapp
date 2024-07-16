package org.mphasis.practice;

import java.util.*;

public class Grade {

	static void result(int percentage) {
		if (percentage >= 60 && percentage <= 100 )
			System.out.println("A Grade");
		else if (percentage >= 45 && percentage < 60 )
			System.out.println("B Grade");
		else if (percentage >= 35 && percentage < 45 )
			System.out.println("C Grade");
		else if (percentage >= 0 && percentage < 35 )
			System.out.println("Fail");
		else
			System.out.println("SORRY");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Percentage");
		int percentage = sc.nextInt();
		result(percentage);

	}

}
