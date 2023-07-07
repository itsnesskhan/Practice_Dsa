package com.example.leetcode.striverSdeSheet;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayWithGivenSum {

	public static int subarraysWithGivenSum(ArrayList<Integer> arr, int sum) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
			int count = 0;
			int current = 0;
			for(int i=0;i<arr.size();i++){
				
				current+=arr.get(i);
				if(current == sum){
					count++;
				}
				if(map.containsKey(sum-current)){
					count+=map.get(sum-current);
				}
				if(map.containsKey(current)){
					map.put(current, map.get(current)+1);
				}
				else{
					map.put(current, 1);
				}
			}

			return count;
		}
	
	public static void main(String[] args) {
		int[] arr = {5 ,3 ,8 ,3 ,10};
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(3);
		list.add(10);
		int x =8;
		System.out.println(subarraysWithGivenSum(list, x));
	}
}
