package com.example.practice;

import java.util.Arrays;

public class ReverserArrayAndString {
	
	public static void revString(String str) {
		String revString ="";
		char[] array = str.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			revString=array[i]+revString;
		}
		System.out.println(revString);
	}
	
	public static void swapStrings(String str1, String str2) {
		
		str1 = str1.concat(str2);
		
		str2 = str1.substring(0, str1.length()- str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public static void reverseArray(int[] arr) {
		int startIndex = 0;
		int endIndex = arr.length-1;
		
		while (startIndex<=endIndex) {
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			
			startIndex++;
			endIndex--;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	public static void main(String[] args) {
		String string= "Nasser";
		String string2 = "Khan";
		
//		reverse string
		revString(string);
		
		System.out.println("*****************************************************");
		
//		swap strings
		swapStrings(string, string2);
		
		System.out.println("******************************************************");
		
		int[] arr = {12,34,4,6,23,56,11};
		reverseArray(arr);
	}

}
