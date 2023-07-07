package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class LargestAndMinSubArrayWithGivenSum {

	
	public static ArrayList<Integer> subArrayWithGivenSum(int[] arr, int sum){
		int currentSum=0;
		int start =0;
		int end =-1;
		int maxLen = -1;
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> suMap = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
				currentSum+=arr[i];
			if (currentSum-sum==0) {
				end =i;
				maxLen = Math.max(maxLen, end-start);
			}
			if (suMap.containsKey(currentSum-sum)) {
				start = suMap.get(currentSum-sum)+1;
				end = i;
				maxLen = Math.max(maxLen, end-start);
			}
			suMap.put(currentSum, i);
		}
		if (end==-1) {
			System.out.println("No sub array found");
		}else {
			list.add(start);
			list.add(end);
		}
		System.out.println("max len "+maxLen);
		return list;
	}
	
	public static void main(String[] args) {
		int arr[] = {5,-3,8,9,-4,-3,3};
		ArrayList<Integer> subArrayWithGivenSum = subArrayWithGivenSum(arr, 13);
		System.out.println(subArrayWithGivenSum);
	}
}
