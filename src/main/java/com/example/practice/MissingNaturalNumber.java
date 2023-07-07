package com.example.practice;

import java.util.List;
import java.util.stream.Collectors;

public class MissingNaturalNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,7,8,9,10};
//		formula to find sum of natural numbers n*(n+1)/2
		int sum = 10*(10+1)/2;
		int actualSum =0;
		for (int i : arr) {
			actualSum+=i;
		}
		System.out.println("MISSING NATURAL NUMBER IS "+(sum-actualSum));
		
		String str = "nasser khan Nasser Khan";
	
		int mid = str.length()/2;
		String lowerCase = "";
		String upperCase = "";
		lowerCase = str.substring(0,mid).toLowerCase();
		upperCase = str.substring(mid).toUpperCase();
		
		System.out.println(lowerCase);
		System.out.println(upperCase);
		
	}
}
