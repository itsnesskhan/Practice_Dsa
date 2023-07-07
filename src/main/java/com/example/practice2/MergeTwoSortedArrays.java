package com.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class MergeTwoSortedArrays {

    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        
    	ArrayList<Integer> res = new ArrayList();
    	
    	for (int i = 0; i < arr1.length; i++) {
    			if(arr1[i] ==0)
    				continue;
    			res.add(arr1[i]);
		}
    	
    	for (int i = 0; i < arr2.length; i++) {
    		if(arr1[i] ==0)
				continue;
			res.add(arr2[i]);
    	}
    	
    	Collections.sort(res);
    	
    	int i=0;
    	int arr[] = new int[res.size()];
    	for (int j : res) {
			arr[i++] = j;
		}
    	
    	return arr;
    
    }
    
    public static int[] ninjaAndSortedArraysWithoutExtraSpace(int arr1[], int arr2[], int m, int n) {
        int i = m-1, j= n-1, k= m+n-1;

        while(i>=0 && j>=0){

            if(arr1[i]>arr2[j]){
                arr1[k]= arr1[i];
                i--;
                k--;
            }
            else{
                arr1[k] = arr2[j];
                k--;
                j--;
            }
        }

        while(i>=0){
            arr1[k--]= arr1[i--];
        }
        while(j>=0){
            arr1[k--] = arr2[j--];
        }

        return arr1;
     }
    
    public static void main(String[] args) {
		int arr[] = {3,6,9,0,0};
		int arr1[] = {4,10};
		int[] ninjaAndSortedArrays = ninjaAndSortedArraysWithoutExtraSpace(arr, arr1, 3, 2);
		System.out.println(Arrays.toString(ninjaAndSortedArrays));
	}
}
