package com.example.leetcode.striverSdeSheet;

import java.util.Arrays;

public class TropingRainWater {

public static long getTrappedWater(long[] arr, int n) {
	long[] left = new long[n];
	long[] right = new long[n];
	
	left[0] = arr[0];
	
	for(int i=1;i<n;i++) {
		left[i] = Math.max(left[i-1], arr[i]);
	}
	System.out.println(Arrays.toString(left));
	
	right[n-1] = arr[n-1];
	
	for(int j = n-2;j>=0;j--) {
		right[j] = Math.max(right[j+1], arr[j]);
	}
	
	System.out.println(Arrays.toString(right));
	
	long ans  = 0;
	
	for(int i=0;i<n;i++) {
		ans+= (Math.min(left[i] , right[i])- arr[i]);
	}
	return ans;
    }


	public static void main(String[] args) {
		long[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(Arrays.toString(arr));
		System.out.println(getTrappedWater(arr, arr.length));
	}
}
