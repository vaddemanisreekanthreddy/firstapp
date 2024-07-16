package org.mphasis.practice;

import java.util.Scanner;

public class Complex {
   
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Real number");
		double a=sc.nextDouble();
		System.out.println("Enter First imaginary number");
		double b=sc.nextDouble();
		System.out.println("Enter Second Real number");
		double c=sc.nextDouble();
		System.out.println("Enter Second imaginary number");
		double d=sc.nextDouble();
		double real=a+c;
		double imaginary=b+d;
		if(imaginary>=0)
		     System.out.println(real+"+"+imaginary+"i");
		else
			System.out.println(real+""+imaginary+"i");
		

		
		
	}
}

