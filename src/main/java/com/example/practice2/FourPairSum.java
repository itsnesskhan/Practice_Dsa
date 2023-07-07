package com.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourPairSum {
	
    public static List<List<Integer>> fourSum(int[] nums, int target) {
    	Arrays.sort(nums);
    	List<List<Integer>> ans = new ArrayList<>();
    	
        for(int i=0;i<nums.length-3;i++) {
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}

        	
        	for (int j = i+1; j < nums.length-2; j++) {
				if(j>i+1 && nums[j]==nums[j-1]) {
//				j--;
				continue;
			}
        		
        		
        		int low = j+1, high= nums.length-1;
//        		if (j==0 || (i>0 && nums[i]!=nums[i-1])) {
					while (low<high) {
						
						long sum = (long)nums[low]+nums[high]+nums[i]+nums[j];
						if(sum==target) {
							ArrayList<Integer> list = new ArrayList<>();
							list.add(nums[i]);
							list.add(nums[j]);
							list.add(nums[low]);
							list.add(nums[high]);
							ans.add(list);
							while(low<high&&nums[low]==nums[low+1]){
	                            low++;
	                        }
	                        while(low<high&&nums[high]==nums[high-1]){
	                            high--;
	                        }
							low++;
							high--;
						}
						else if(sum<target) {
							low++;
						}
						else {
							high--;
						}
					}
//				}
			}
        }
        return ans;

    }
    
    public static List<List<Integer>> fourSumop(int[] nums, int target) {

        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int left;
        int right;
        for(int j=0; j<nums.length-3; j++){
            
            for(int i=j+1; i<nums.length-2 ; i++){
                left = i+1;
                right = nums.length-1;
                while(left<right){
                    
                    long sum = nums[j];
                    sum += nums[i];
                    sum += nums[left];
                    sum += nums[right];
                    if(sum==target){
                        set.add(Arrays.asList(nums[j],nums[i],nums[left],nums[right]));
                        left++;
                    }
                    else if(sum<target) left++;
                    else right--;
                }

            }          
        }
        
        return new ArrayList<>(set);
        
    }
    



	
	public static void main(String[] args) {
		int[] nums = {1,0,-1,0,-2,2};
		int[] nums1 = {2,2,2,2,2};
		int[] nums2 = {1000000000,1000000000,1000000000,1000000000};

		int target = 0;
		int target1 = 8;
		int target2 = -294967296;
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
		List<List<Integer>> fourSum = fourSumop(nums1, target1);
		System.out.println(fourSum);

	}
}
