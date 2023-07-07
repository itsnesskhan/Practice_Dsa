package com.example.practice2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestConsecutiveSequence {

	public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
    
        int maxCount = 0;
        int count = 1;
        int current = 0;
        HashMap<Integer, Boolean> set = new HashMap<>();
        for(int i=0;i<N;i++){
            set.put(arr[i], true);
        }

        for(int i=0;i<N;i++){
            if(set.containsKey(arr[i]-1)){
                set.put(arr[i], false);
            }
        }
        System.out.println(set);
        Set<Integer> keySet = set.keySet();
        for (Integer key : keySet) {
			if (set.get(key)== true) {
	                count=0;
	                current=key;
	                while(set.containsKey(current)){
	                    count++;
	                    current++;
	                }
	                maxCount = Math.max(count, maxCount);
			}
		}
        return maxCount;
	}
	
	public static int lengthOfLongestConsecutiveSequenceOptamized(int[] arr, int N) {
	    int maxCount = 0;
	    HashSet<Integer> set = new HashSet<>();

	    for (int i = 0; i < N; i++) {
	        set.add(arr[i]);
	    }

	    for (int i = 0; i < N; i++) {
	        if (!set.contains(arr[i] - 1)) {
	            int count = 0;
	            int current = arr[i];
	            while (set.contains(current)) {
	                count++;
	                current++;
	            }
	            maxCount = Math.max(count, maxCount);
	        }
	    }

	    return maxCount;
	}

	
	public static void main(String[] args) {
		int[] arr = {1 ,9 ,3 ,10 ,4 ,20, 2};
		System.out.println(lengthOfLongestConsecutiveSequence(arr, arr.length)); //ans 1,2,3,4
	}
}
