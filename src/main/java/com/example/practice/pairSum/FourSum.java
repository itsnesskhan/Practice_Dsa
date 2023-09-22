package com.example.practice.pairSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();

		for (int i = 0; i < nums.length - 3; i++) {

			if (i != 0 && nums[i] == nums[i - 1]) {
				i++;
				continue;
			}

			for (int j = i + 1; j < nums.length - 2; j++) {

				if (j > i+1 && nums[j] == nums[j - 1]) {
					j++;
					continue;
				}

				int left = j + 1, right = nums.length - 1, sum = target;

				while (left < right) {

					if (nums[i] + nums[j] + nums[left] + nums[right] == sum) {

						List<Integer> pair = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
						ans.add(pair);
						left++;
						right--;
						
						while(left<nums.length-1 && nums[left]==nums[right]) left++;
						while(right>0 && nums[right]==nums[right-1]) right--;
						
					} else if (nums[i] + nums[j] + nums[left] + nums[right] < sum) {
						left++;
					} else {
						right--;
					}
				}

			}

		}
		return ans;

	}
	
	public static List<List<Integer>> fourSum2(int[] nums, int target) {
		Arrays.sort(nums);
List<List<Integer>> ans = new ArrayList<>();

for(int i=0;i<nums.length-3;i++) {
	if(i>0 && nums[i]==nums[i-1]) {
		continue;
	}

	
	for (int j = i+1; j < nums.length-2; j++) {
		if(j>i+1 && nums[j]==nums[j-1]) {
//		j--;
		continue;
	}
		
		
		int low = j+1, high= nums.length-1;
//		if (j==0 || (i>0 && nums[i]!=nums[i-1])) {
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
//		}
	}
}
return ans;

}


	public static void main(String[] args) {
//	  int nums[] = {1,0,-1,0,-2,2};
	  int nums[] = {2,2,2,2,2};
	  System.out.println(fourSum(nums, 0));
	}

}
