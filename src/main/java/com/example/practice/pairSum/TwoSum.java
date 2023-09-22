package com.example.practice.pairSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}
	
	public static int[] twoSumOptimized(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			
			if (map.containsKey(target-nums[i])) {
				return new int[] {map.get(target- nums[i]), i};
			}
			map.put(nums[i], i);
		}
		return new int[] { -1, -1 };
	}
	
	public static int AllPairWithGivenSum(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
        int ans=0;
        for(int i:nums){
            int remaining = k-i;
            if(map.containsKey(remaining)){
                ans++;
                if(map.get(remaining)==1){
                    map.remove(remaining);
                }
                else{
                    map.put(remaining, map.get(remaining)-1);
                }
            }
            else{
                map.put(i, map.getOrDefault(i, 0)+1);
            }
        }
        return ans;
	}
	
	
	public static void main(String[] args) {
		int nums[] = {2,7,11,3,6,15};
		int nums2[] = {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
		System.out.println(Arrays.toString(twoSumOptimized(nums, target)));
		System.out.println(AllPairWithGivenSum(nums2, 3));
	}
}
