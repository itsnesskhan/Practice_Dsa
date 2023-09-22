package com.example.concepts.sort;

import java.util.Arrays;

public class MergeSort {
	
	private static void conquare(int[] arr, int start, int mid, int end) {
		int[] merge = new int[end-start+1];
		int idx1 = start;
		int idx2 = mid+1;
		int x=0;
		
		while(idx1<=mid && idx2<=end) {
			
			if(arr[idx1]<arr[idx2]) {
				merge[x++] = arr[idx1++];
			}
			else {
				merge[x++] = arr[idx2++];
			}
		}
		
		while(idx1<=mid) {
			merge[x++] = arr[idx1++];
		}
		
		while(idx2<=end) {
			merge[x++] = arr[idx2++];
		}
		
		for(int i=0,j=start;i<merge.length;i++,j++) {
			arr[j]= merge[i];
		}
	}

	public static void devide(int[] arr, int start, int end) {
		if(start>=end) {
			return;
		}
			
		int mid = start+(end-start)/2;
		
		devide(arr, start, mid);
		devide(arr, mid+1, end);
		conquare(arr,start,mid,end);
		
		
	}

	

	public static void main(String[] args) {
		int arr[] = {23,14,12,5,7,11};
		devide(arr,0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
