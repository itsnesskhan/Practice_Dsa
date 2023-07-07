package com.example.practice2;

public class ForSumProblem {

	  public static String fourSum(int[] arr, int target, int n) {
	      String ans = "NO";
	      int currentSum =0;
		  int count =0;
	      for (int i = 0; i < arr.length; i++) {
			currentSum+= arr[i];
			count++;
			if(count==4 && currentSum== target) {
				return "YES";
			}
			else if(currentSum>target) {
				currentSum-=arr[i];
			}
		}
		  return ans;
	  }
}
