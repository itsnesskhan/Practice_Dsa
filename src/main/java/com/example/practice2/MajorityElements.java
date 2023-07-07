package com.example.practice2;

import java.util.HashMap;

public class MajorityElements {

	public static int findMajority(int[] arr, int n) {
		  HashMap<Integer, Integer> map = new HashMap<>();
	      for(int i=0;i<n;i++){
			  if(map.containsKey(arr[i])){
				  map.put(arr[i], map.get(arr[i])+1);
				  
			  }
			  else{
				  map.put(arr[i], 1);
			  }

			  if(map.get(arr[i])>=n/2){
				  return arr[i];
			  }
		  }
	      System.out.println(map);
		  return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {5,2,0,0};
		int findMajority = findMajority(arr, 4);
		System.out.println(findMajority);
	}
}
