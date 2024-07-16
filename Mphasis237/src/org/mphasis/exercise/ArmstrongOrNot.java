package org.mphasis.exercise;

import java.util.Scanner;

public class ArmstrongOrNot {

	private static int toArmstrongOrNot(int number) {
		int pow = toCount(number);
		int sum=0;
		while(number!=0) {
			int last=number%10;
			int val=last;
		    for (int i = 1; i < pow; i++) {
		    	val=val*last;
		    }
		    sum=sum+val;
		    number=number/10;
		}
		return sum;
	}

	private static int toCount(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number : ");
		int a = sc.nextInt();
		if(toArmstrongOrNot(a)==a)
			System.out.println(a+" is a ArmStrong Number");
		else
			System.out.println(a+" is Not a ArmStrong Number");
	}

}
