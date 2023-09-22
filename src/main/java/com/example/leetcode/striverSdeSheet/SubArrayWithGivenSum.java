package com.example.leetcode.striverSdeSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubArrayWithGivenSum {

	public static int subarraysWithGivenSum(ArrayList<Integer> arr, int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println(arr
				);
		int count = 0;
		int current = 0;
		map.put(0, 1);
 		for (int i = 0; i < arr.size(); i++) {

			current += arr.get(i);
			if (map.containsKey(current - sum)) {
				count += map.get(current - sum);
			}
			map.put(current ,map.getOrDefault(current,0)+1);
		}
 		System.out.println(map);
		return count;
	}

	public static void subarraysWithGivenSumWithIndex(ArrayList<Integer> arr, int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int start = 0;
		int end = 0;
		int current = 0;
		for (int i = 0; i < arr.size(); i++) {

			current += arr.get(i);
			if (current == sum) {
				end = i;
				System.out.println("start : " + start + " end : " + end);
			}
			if (map.containsKey(sum - current)) {
				start = map.get(sum - current);
				end = i;
				System.out.println("start : " + start + " end : " + end);
				break;
			}
			map.put(current, 1);
		}
		
	}
	
	public static int subarraysWithGivenSumWithMaxSubaArray(ArrayList<Integer> arr, int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int start = 0;
		int end = 0;
		int maxLength = 0;
		int current = 0;
		for (int i = 0; i < arr.size(); i++) {

			current += arr.get(i);
			if (current == sum) {
				end = i;
				maxLength = Math.max(maxLength, end-start+1);
			}
			if (map.containsKey(sum - current)) {
				start = map.get(sum - current);
				end = i;
				maxLength = Math.max(maxLength, end-start+1);
			}
			map.put(current, 1);
		}
		
		return maxLength;
	}
	
	public static int subarraysWithGivenSumWithMinSubaArray(ArrayList<Integer> arr, int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int start = 0;
		int end = 0;
		int minLength = Integer.MAX_VALUE;
		int current = 0;
		for (int i = 0; i < arr.size(); i++) {

			current += arr.get(i);
			if (current == sum) {
				end = i;
				System.out.println("start : "+start+"  end : "+end);
				minLength = Math.min(minLength, end-start+1);
			}
			if (map.containsKey(sum - current)) {
				start = map.get(sum - current);
				end = i;
				System.out.println("start : "+start+"  end : "+end);
				minLength = Math.min(minLength, end-start+1);
			}
			map.put(current, 1);
		}

		return minLength;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 3, 10 };
		ArrayList<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
		int x = 8;
		System.out.println(subarraysWithGivenSum(list, x));
		subarraysWithGivenSumWithIndex(list, x);
		System.out.println("Max Subarray Length : "+subarraysWithGivenSumWithMaxSubaArray(list, x));
		System.out.println("Min Subarray Length : "+subarraysWithGivenSumWithMinSubaArray(list, x));
	}
}
