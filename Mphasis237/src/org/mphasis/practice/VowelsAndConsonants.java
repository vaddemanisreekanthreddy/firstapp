package org.mphasis.practice;

import java.util.*;

public class VowelsAndConsonants {

	static String isVowel(char c) {
		if (c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U'  )
		    return "Vowel";
		else
			return "Consonant";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char c = sc.next().charAt(0);
		System.out.println(c +" is "+isVowel(c));
	}
}
