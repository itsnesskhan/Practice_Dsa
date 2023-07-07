package com.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElementsInList {

    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        double floor = Math.floor(arr.size()/3);
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer integer : arr) {
			
        	if (map.containsKey(integer)) {
				map.put(integer, map.get(integer)+1);
			}
        	else {
        		map.put(integer, 1);
        	}
		}
        
          Set<Integer> keySet = map.keySet();
          for (Integer integer : keySet) {
			if (map.get(integer)>floor) {
				ans.add(integer);
			}
		}
        
        return ans;
    }
    
    
    public static void main(String[] args) {
		ArrayList<Integer> list  = new ArrayList<>(Arrays.asList(3 ,2 ,2 ,1 ,5 ,2 ,3));
		System.out.println(majorityElementII(list));
	}
}
