package org.mphasis.exercise;

import java.util.Scanner;

public class NeonNumber {
	private static int toNeon(int number ) {
		int num=number*number;
		int sum=0;
		while(num>0) {
			int last=num%10;
			sum=sum+last;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number : ");
		int number = sc.nextInt();
		if(toNeon(number)==number)
			System.out.println("Neon Number");
		else
			System.out.println("Not a Neon Number");	
	}
}
