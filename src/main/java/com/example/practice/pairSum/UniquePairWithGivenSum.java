package com.example.practice.pairSum;

import java.util.ArrayList;
import java.util.Arrays;

public class UniquePairWithGivenSum {

	public static ArrayList<int[]> uniquePairWithGivenSum(int[] nums, int k) {
		ArrayList<int[]> list = new ArrayList<>();
		Arrays.sort(nums);
		int left = 0;
		int right = nums.length - 1;
		int sum = k;

		while (left < right) {

			if (left != 0 && nums[left] == nums[left - 1]) {
				left++;
				continue;
			}


			if (nums[left] + nums[right] == sum) {
				list.add(new int[] { nums[left], nums[right] });
				left++;
				right--;
			}
			else if (nums[left] + nums[right] < sum) {
				left++;
			} else {
				right--;
			}
		}

		return list;
	}

	public static void main(String[] args) {
		int nums2[] = { 2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2 };
		ArrayList<int[]> uniquePairWithGivenSum = uniquePairWithGivenSum(nums2, 3);
		uniquePairWithGivenSum.stream().forEach(pair -> System.out.println(Arrays.toString(pair)));
	}
}
