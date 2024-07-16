package org.mphasis.exercise;

import java.util.Scanner;

public class ReverseIntegers {
	private static void toReverse(int a) {
		int num=0;
    		while(a>0) {
    			 int last=a%10;
    			 num=num*10+last;
    			 a=a/10;
    		}
    		System.out.println(num);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number : ");
		int a = sc.nextInt();
		toReverse(a);	
	}
}
