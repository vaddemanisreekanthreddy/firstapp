package org.mphasis.practice;

import java.util.Scanner;

public class SimpleIntrest {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter Price : ");
			int price = sc.nextInt();
			System.out.println("Please Enter Rate Of Intest in Percent : ");
			float interest = sc.nextFloat();
			System.out.println("Please Enter Time Duration in Years : ");
			int time = sc.nextInt();
			float si =(price*interest*time)/100;
			System.out.println(" The Simple Interest is : " +si);
		}
	

}
