package com.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingAndReapting {

	public static int[] missingAndRepeating(List<Integer> arr, int n) {
		int missing = 0;
		int reapting = 0;
		int[] ans = new int[2];
		Collections.sort(arr);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) != i + 1) {
				missing = i + 1;
				if (reapting == 0)
					reapting = arr.get(i);
			}

		}
		ans[0] = missing;
		ans[1] = reapting;
		return ans;
	}

	public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
		int r = 0, m = 0;

		// Checking for the repeating number
		for (int i = 0; i < n; i += 1) {
			for (int j = i + 1; j < n; j += 1) {
				int x = arr.get(i);
				int y = arr.get(j);
				if (x == y) {
					r = arr.get(i);
					break;
				}
			}
		}

		// Calculating the sum of the array
		int currSum = 0;
		for (int i = 0; i < n; i += 1) {
			currSum += arr.get(i);
		}

		// Sum of the numbers from 1 to n
		int actualSum = n * (n + 1) / 2;

		m = actualSum - (currSum - r);

		int ans[] = new int[] { m, r };

		return ans;

	}

	public static void main(String[] args) {
//		List<Integer> of = List.of(6,4,3,5,5,1);
		ArrayList<Integer> list = new ArrayList<>();
//    	list.add(6);
//    	list.add(4);
		list.add(3);
		list.add(3);
//    	list.add(5);
//    	list.add(5);
		list.add(2);
		list.add(1);
		int[] missingAndRepeating = missingAndRepeating(list, list.size());
		System.out.println(Arrays.toString(missingAndRepeating));
	}
}
