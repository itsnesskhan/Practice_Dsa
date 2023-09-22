package com.example.concepts;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseArray {
	
	private static int[] reverse(int[] arr) {
		int[] reverse = new int[arr.length];
		int j= arr.length-1;
		for(int i =0;i<arr.length;i++) {
			reverse[j--] = arr[i];
		}
		return reverse;
	}
	
	private static void reverseInExisting(int[] arr) {
		
		int j= arr.length-1;
		for(int i =0;i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j--] = temp;
			
		}
		
	}
	
	private static void reverseInExistingWithIndex(int[] arr, int start, int end) {
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	}

	
	public static void main(String[] args) {
		int[] arr = {12,4,54,23,5,11};
//		int[] reverse = reverse(arr);
//		System.out.println(Arrays.toString(reverse));
//		reverseInExisting(arr);
//		System.out.println(Arrays.toString(arr));
		reverseInExistingWithIndex(arr, 0, 1);
		System.out.println(Arrays.toString(arr));
		
		int arr2[]  = {12,3,42,3,22,12,22,3};
		Map<Integer,Long> collect = Arrays.stream(arr2).boxed().collect(Collectors.groupingBy(item->item, Collectors.counting()));
		System.out.println(collect);
	}

	

}
