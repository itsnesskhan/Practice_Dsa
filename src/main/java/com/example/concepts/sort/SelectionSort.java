package com.example.concepts.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int small = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[small]>arr[j]) {
					small = j;
				}
			}
			
			swap(arr, small,i);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		
		
	}

	public static void main(String[] args) {
		int arr[] = {23,14,12,5,7,11};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
