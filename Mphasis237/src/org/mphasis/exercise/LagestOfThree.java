package org.mphasis.exercise;

import java.util.Scanner;

public class LagestOfThree {
	
	private static void toLagestOfThree(int a,int b,int c) {
                     if(a>b && a>c)
                    	 System.out.println(a+ " ");
                     else if(b>a && b>c)
                    	 System.out.println(b+ " ");
                     else  if(c>b && c>a)
                    	 System.out.println(c+ " ");
                     else
                    	 System.out.println("Sorry");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		toLagestOfThree(a,b,c);
	}

	
}


