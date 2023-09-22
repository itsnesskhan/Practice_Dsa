
package com.example.concepts.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
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
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
