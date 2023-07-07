package com.example.practice2;

import java.util.Arrays;
import java.util.HashMap;

public class FrequenceyCount {

    public static void frequencyCount(int arr[], int N, int P)
    {
    	HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
			
        	if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
        	else {
        		map.put(arr[i], 1);
        	}
		}
       
        
        for(int i=1;i<=arr.length;i++) {
        	if(map.containsKey(i)) {
        		arr[i-1] = map.get(i);
        	}
        	else {
                arr[i-1] = 0;
        	}
        }
        
    }
    
    public static void main(String[] args) {
//    	int arr[] = {2, 3, 2, 3, 5};
    	int arr[] = {3, 2, 2, 2, 1};
    	frequencyCount(arr, arr.length, 3);
    	System.out.println(Arrays.toString(arr));
	}
}
