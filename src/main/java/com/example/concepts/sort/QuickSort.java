package com.example.concepts.sort;

import java.util.Arrays;

public class QuickSort {
	
	public static int partision(int arr[],int start,int end) {
		int pivot = arr[end];
		int i = start-1;
		
		for(int j=start;j<end;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		i++;
		swap(arr,i,end);
		return i;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		
	}

	public static void quickSort(int[] arr, int start, int end) {
		if(start<end) {
			int pivot = partision(arr, start, end);
			
			quickSort(arr, start, pivot-1);
			quickSort(arr, pivot+1, end);
		}
	}

	

	public static void main(String[] args) {
		int arr[] = {23,14,12,5,7,11};
		quickSort(arr,0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
