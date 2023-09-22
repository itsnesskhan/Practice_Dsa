package com.example.fiftyinterviewQuestions;

public class BinarySearch {
	
	private static int search(int arr[], int key, int start, int end) {
		
		
		while (start<=end) {
			int mid = start+(end-start)/2;
			if (key == arr[mid]) {
				return mid;
			}
			else
			if (key>arr[mid]) {
				start = mid+1;
			}
			else {
				end =  mid -1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]  = {1,3,8,12,21,25,32};
		int index = search(arr,48, 0, arr.length-1);
		System.out.println("found at index : "+index);
	}

	

}
