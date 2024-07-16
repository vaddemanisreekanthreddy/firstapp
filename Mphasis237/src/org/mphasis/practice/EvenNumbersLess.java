package org.mphasis.practice;

import java.util.*;

public class EvenNumbersLess {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList();
		int n=5;
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
			if(n==arr[i] || (n>arr[i] && arr[i]%2==0)) {
				l1.add(arr[i]);
			}
		}
        System.out.println(l1);
	}
}
