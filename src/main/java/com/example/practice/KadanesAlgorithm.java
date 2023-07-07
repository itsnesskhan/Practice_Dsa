package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KadanesAlgorithm {
	
	public static ArrayList<Integer> findMaxSubArray(int[] arr){
		
		ArrayList<Integer> list = new ArrayList<>();
		int sum=0;
		int currentSum =0;
		int start =0;
        int end = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			currentSum+=arr[i];
			if (currentSum<0) {
				currentSum=0;
				start = i+1;
			}
			else if (currentSum>sum) {
				
				sum = currentSum;
				end = i;
			}
			
			
		
		}
		System.out.println(sum);
		list.add(start);
		list.add(end);
		
		return list;
	}
	
	public static ArrayList<Integer> subArrayWithGivenSum(int[] arr, int sum){
		int currentSum=0;
		int start =0;
		int end =-1;
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> suMap = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
				currentSum+=arr[i];
			if (currentSum-sum==0) {
				end =i;
				break;
			}
			if (suMap.containsKey(currentSum-sum)) {
				start = suMap.get(currentSum-sum)+1;
				end = i;
				break;
			}
			suMap.put(currentSum, i);
		}
		if (end==-1) {
			System.out.println("No sub array found");
		}else {
			list.add(start);
			list.add(end);
		}
		
		return list;
	}

	public static void main(String[] args) {
//		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};    //given sum 6
		int[] arr = {5,4,-1,7,8,-3}; 
//		int[] arr = {1};
		ArrayList<Integer> findMaxSubArray = findMaxSubArray(arr);
		System.out.println(findMaxSubArray);
		ArrayList<Integer> subArrayWithGivenSum = subArrayWithGivenSum(arr, 3);
		System.out.println(subArrayWithGivenSum);
	}
}
