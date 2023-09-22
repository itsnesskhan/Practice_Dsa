package com.example.practice.pairSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {

	 public static List<List<Integer>> threeSum(int[] nums) {
		 	Arrays.sort(nums);
	        List<List<Integer>> list = new ArrayList<>();
	        
	        for(int i = 0;i<=nums.length-3;i++) {
	        	
	        	if (i!=0 && nums[i]==nums[i-1]) {
					continue;
				}
	        	
	        	int low=i+1, high = nums.length-1, sum = 0;
					
	        		
	        		while(low<high) {			
	        			
	        			if(nums[low]+nums[high]+nums[i] == sum) {
	        				List<Integer> pair = new ArrayList<>();
	        				pair.add(nums[i]);
	        				pair.add(nums[low]);
	        				pair.add(nums[high]);
	        				list.add(pair);
	        				low++;
	        				high--;
	        				while(low<high-1 && nums[low]==nums[low+1] )  
	        					low++;
	        				while(high>0 && nums[high]==nums[high-1]) {
	        					high--;
	        				}
	        				
	        			}
	        			else if(nums[low]+nums[high]<sum) {
	        				low++;
	        			}
	        			else {
	        				high--;
	        			}
	        		}
	        		
	        }
	        
	        return list;
	    }
	 
	
	 
	 public static void main(String[] args) {
//		int nums[] = {-1,0,1,2,-1,-4};
		int nums[] = {-2,0,1,1,2};


		System.out.println(threeSum(nums));
	}
}
