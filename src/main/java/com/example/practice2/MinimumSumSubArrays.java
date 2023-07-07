package com.example.practice2;

import java.util.Arrays;
import java.util.HashMap;

class pair{
	int count;
	int index;
	
	public pair(int count, int index) {
		this.count = count;
		this.index = index;
	}
	
	
}

public class MinimumSumSubArrays {

	public static long findSubarray(long[] arr ,int n) 
    {
		long sum =0;
		int count =0;
		HashMap<Long, pair> map = new HashMap<>();
		
		map.put(0l, new pair(1,0));
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
			
			if(map.containsKey(sum)) {
				count+=map.get(sum).count;
				
				System.out.println(arr[map.get(sum).index]+" ,"+arr[i]);
				map.get(sum).count++;
				map.put(sum, map.get(sum));
			}
			else {
				map.put(sum,new pair(1,i));				
			}
		}
		
		return count;
    }
	
   static long findSwapValues(long A[], int n, long  B[], int m)
    {
        long s1= 0;
		 long s2= 0;
		 
	     for(int i=0;i<n;i++) 
	    	 s1+=A[i];
	     
	     for(int i=0;i<m;i++)
	    	 s2+=B[i];
	    
	    for(int i=0;i<m;i++){
	        B[i]*=2;
	    }
		 Arrays.sort(B);
		 
		 for(int i=0;i<n;i++){
		     long need = s2-s1 +2*A[i];
		     if(Arrays.binarySearch(B, need)>0){
		         return 1;
		     }
		 }
	    
		 return -1;
    }
	
	
	public static void main(String[] args) {
		long[] arr = {0,0,5,5,0,0};
		long findSubarray = findSubarray(arr, arr.length);
			System.out.println(findSubarray);
			int binarySearch = Arrays.binarySearch(arr, 10);
			System.out.println(binarySearch);
	}
}
