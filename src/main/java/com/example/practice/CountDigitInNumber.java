package com.example.practice;

import java.util.Arrays;

public class CountDigitInNumber {

	public static void main(String[] args) {
		int i= 123456;
		
		String string = Integer.toString(i);
		System.out.println(string.length());
		
		//or
		int count =0;
		while (i>0) {
			count++;
			i/=10;
			
		}
		
		System.out.println(count);
		
//		remove specifice character's from string
		String str = "Intelliatech";
		
//		remove n
		
		char charAt = str.charAt(0);
		System.out.println(str.charAt(0));
		
		String string2 = str.replaceAll("([Ii])", "");
		System.err.println(string2);
		int k=0;
		int[] arr = {1,2,3,4,5,6,7,8,9,10,20,14,13};
		int[] arr2 = new int[arr.length];
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]%2==0) {
				arr2[k] =arr[j];
				k++;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]%2!=0) {
				arr2[k] =arr[j];
				k++;
			}
		}
		
		System.out.println(Arrays.toString(arr2));
		
	
	}
}
