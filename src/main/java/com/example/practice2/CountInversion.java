package com.example.practice2;

import java.util.Arrays;

public class CountInversion {
	 
	public static long getInversions(long arr[], int n) {
        long count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                count++;
            }
        }
        return count;
    }
		
	public static long getInversionsOptimized(long arr[], int n) {
		 return mergeSort(arr, 0, n-1);
	}
	
	public static int mergeSort(long[] arr, int l, int r) {
		int inversion_count = 0;
		if (l<r) {
			int mid = (l+r)/2;
			inversion_count+= mergeSort(arr, l, mid);
			inversion_count+= mergeSort(arr, mid+1, r);
			
			inversion_count+= mergeArrays(arr ,l,mid, r);
		}
		return inversion_count;
	}
	
	public static long mergeArrays(long[] arr, int l, int mid, int r) {
		long swaps = 0;
		long[] left = Arrays.copyOfRange(arr, l, mid+1);
		long[] right = Arrays.copyOfRange(arr, mid+1, r+1);
		
		int i = 0;
		int k= l;
		int j = 0;
		
		while(i<left.length && j< right.length) {
			
			if (left[i]<=right[j]) {
				arr[k++] = left[i++];
			}
			else {
				arr[k++] = right[j++];
				swaps+= left.length-i;
			}
		}
		
		while(i<left.length) {
			arr[k++] = left[i++];
		}
		while(j<right.length) {
			arr[k++] = right[j++];
		}
		
		return swaps;
		
	}

	public static void main(String[] args) {
		long[] arr = {2 ,5 ,1 ,3 ,4};
		long inversions = getInversionsOptimized(arr, arr.length);
		System.out.println(inversions);
	}

}
