package com.example.practice;

import java.util.ArrayList;
import java.util.List;

public class StockByeAndSell {
	
	public static ArrayList<ArrayList<Integer>> byeSell(int[] arr){
	
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		int i = 0;
		int n = arr.length-1;
		int buyIndex=0;
		int sellIndex=0;
		
		while (i<n-1) {
			
			//buy
			while (i<n-1 && arr[i]>arr[i+1]) {
				i++;
			}
			ArrayList<Integer> list = new ArrayList<>();
			buyIndex=i++;
			list.add(buyIndex);
			
			
			if (i==n-1) {
				break;
			}
			
			//sell
			while (i<=n-1 && arr[i]> arr[i-1]) {
				i++;
			}
			sellIndex=i-1;
			list.add(sellIndex);
			res.add(list);
			
		}
	
		return res;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {10,6 ,3,8,4,8,12,21,13};
		ArrayList<ArrayList<Integer>> byeSell = byeSell(arr);
		System.out.println(byeSell);
	}

}
