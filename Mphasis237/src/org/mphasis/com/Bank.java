package org.mphasis.com;

import java.util.Scanner;

public class Bank {
	int accno;
	String name;
	float bal;
	Scanner ob=new Scanner(System.in);
	void input()
	{
		System.out.println("enter accno,name and initial balance");
		accno=ob.nextInt();
		name=ob.next();
		bal=ob.nextFloat();
	}
	void deposite()
	{
		System.out.println("Enter the amount want to deposite");
		float deposite=ob.nextFloat();
		System.out.println("The final balance is "+(bal+deposite));
	}
	void withdraw( )
	{	
		System.out.println("Enter the amount want to withdraw");
		float withdraw=ob.nextFloat();
		if(bal-withdraw >= 1000)
		{
			bal=bal-withdraw;
			System.err.println("WithDarw Successfully Completed");
			System.out.println("The final balance is "+bal);
		}
		else
			System.out.println("cannot withdraw balance is low");
	}
	public static void main(String[] args)
	{
		Bank ob1=new Bank();
		System.out.println("enter your choice");
		System.out.println("1.deposite");
		System.out.println("2.withdraw");
		Scanner ob=new Scanner(System.in);
		int choice=ob.nextInt();
		if(choice==1)
		{
			ob1.input();
			ob1.deposite();
		}
		else
		{
			ob1.input();
			ob1.withdraw();
		}
		ob.close();
	}
}
