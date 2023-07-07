package com.example.leetcode.striverSdeSheet;

import java.util.ArrayList;
import java.util.HashMap;

public class CountSubArraysWithGivenXor {

	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
			int count = 0;
			int xor = 0;
			for(int i=0;i<arr.size();i++){
				xor^=arr.get(i);
				if(xor == x){
					count++;
				}
				if(map.containsKey(xor^x)){
					count+=map.get(xor^x);
				}
				if(map.containsKey(xor)){
					map.put(xor, map.get(xor)+1);
				}
				else{
					map.put(xor, 1);
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
		System.out.println(subarraysXor(list, x));
	}
}
