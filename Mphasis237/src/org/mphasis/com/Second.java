package org.mphasis.com;

import java.util.Scanner;

public class Second {
	int empno;
	String name,address;
	void input()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter empno,name,address");
		empno=ob.nextInt();
		name=ob.next();
		address=ob.next();
	}
	void display()
	{
	System.out.println("the empno is "+empno);	
	System.out.println("the emp name  is "+name);	
	System.out.println("the emp address is "+address);	
	}
	public static void main(String[] args) {
		Second obj=new Second();
		obj.input();
		obj.display();
	}
}
