package com.example.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverArrayInGroubs {

	public static void reverse(int[] arr, int start, int end ) {
		int i=start;
		int j=end;
		int temp = 0;
		
		for (int k = 0; k < end/2; k++) {
			temp = arr[j];
			arr[j] = arr[k];
			arr[k] = temp;
			j--;
		}
	}
	
	public static void reverseWithWhile(int[] arr, int start, int end ) {
		int i=start;
		int j=end;
		int temp = 0;
		
		while(i<=j) {
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
	}
	
	static void reverseInGroups(int[] arr, int n, int k) {
	    reverseWithWhile(arr, 0, n);
	    System.out.println(Arrays.toString(arr));
	    reverseWithWhile(arr, 0, k-1);
	    System.out.println(Arrays.toString(arr));
	    reverseWithWhile(arr, k, n);
    }
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println("working");
//		reverseWithWhile(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("**************************************************************");
		
		reverseInGroups(arr, arr.length-1, 2);
		System.out.println(Arrays.toString(arr));
	}
}
