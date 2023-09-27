package com.example.practice3;

public class MaxConsective {
	
	public static int maxLen(int[] arr){
		int maxCount =0;
		for(int i=0;i<arr.length;i++){
		   int tempCount =0;
		  for(int j=i;j<arr.length;j++){
			if(arr[i]==arr[j]){
			   tempCount++;	
			}
			else{
			   break;
			}
		    }
			maxCount = Math.max(maxCount, tempCount);	
		}
		return maxCount;

	}
	
	public static int maxConcective(int[] arr){
		int maxCount =0;
		int currCount =0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				currCount = 0;
			}
			else {
				currCount++;
				maxCount = Math.max(maxCount, currCount);
			}
			
		}
		
		return maxCount;
	}

	
	public static void main(String[] args) {
		int [] arr = {1,1,0,1,1,1,0,1,1,1,1};
			System.out.println(maxLen(arr));
			System.out.println(maxConcective(arr));
	}

}
