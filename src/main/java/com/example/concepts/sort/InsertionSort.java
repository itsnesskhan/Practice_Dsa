package com.example.concepts.sort;

import java.util.Arrays;

public class InsertionSort {

public static void insertionSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			
			int current = arr[i];
			
			int j = i-1;
			while(j>=0 && current<arr[j] ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		
		
	}

	public static void main(String[] args) {
		int arr[] = {23,14,12,5,7,11};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
