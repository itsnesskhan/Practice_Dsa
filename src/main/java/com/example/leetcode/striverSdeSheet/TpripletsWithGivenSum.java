package com.example.leetcode.striverSdeSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class TpripletsWithGivenSum {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K) {
		Arrays.sort(arr);
		HashSet<ArrayList<Integer>> ans = new HashSet<ArrayList<Integer>>();
		for (int i = 0; i < n-2; i++) {

				int low = i + 1, high = n - 1, sum = K - arr[i];

				while (low < high) {

					if (arr[low] + arr[high] == sum) {
						ArrayList<Integer> list = new ArrayList<Integer>();
						list.add(arr[i]);
						list.add(arr[low]);
						list.add(arr[high]);

						Collections.sort(list);
						ans.add(list);
						low++;
						high--;
					} else if (arr[low] + arr[high] > sum) {
						high--;
					} else {
						low++;
					}
				

			}
		}

		return new ArrayList<>(ans);

	}

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 1, 2, 3 };
		int[] arr = { 10, 5, 5, 2};
		ArrayList<ArrayList<Integer>> findTriplets = findTriplets(arr, arr.length, 12);
		System.out.println(findTriplets);

	}
}
