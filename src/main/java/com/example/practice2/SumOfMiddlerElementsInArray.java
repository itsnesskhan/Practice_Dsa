package com.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Stream;

public class SumOfMiddlerElementsInArray {
	
	static int findMidSum(int[] ar1, int[] ar2, int n) {
        ArrayList<Integer> sorta = new ArrayList<>();
        for (int i = 0; i < ar2.length; i++) {
			sorta.add(ar1[i]);
			sorta.add(ar2[i]);
		}
        
       Collections.sort(sorta);
       int mid =  sorta.size()/2;
		return sorta.get(mid-1)+sorta.get(mid);
    }
	
	
	public static void main(String[] args) {
	  int Ar1[] = {1, 2, 4, 6, 10};
	  int Ar2[] = {4, 5, 6, 9, 12};
	  int findMidSum = findMidSum(Ar1, Ar2, Ar1.length);
	  System.out.println(findMidSum);
	  
	}
}
