package com.example.concepts.sort;

import java.util.Arrays;

public class NoramlSorting {
	
	public static void customSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		
		
	}

	public static void main(String[] args) {
		int arr[] = {23,14,12,5,7,11};
		customSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
