package com.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class nextPermutation {

	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		if(permutation.size()<=1){
			return permutation;
		}

		int idx1=-1;
		for(int i=permutation.size()-2;i>=0;i--){
			if(permutation.get(i)<permutation.get(i+1)){
				idx1=i;
				break;
			}
		}
		if(idx1<0){
			Collections.reverse(permutation);
		}
		else {
			int idx2 =0;
			for (int i = permutation.size()-1; i >=0; i--) {
				if (permutation.get(i)>permutation.get(idx1)) {
					idx2 = i;
					break;
				}
			}
			
			swap(permutation, idx1,idx2);
			Collections.sort(permutation.subList(idx1+1, permutation.size()));
		}
		
		
		return permutation;
	}

	private static void swap(ArrayList<Integer> permutation, int idx1, int idx2) {
		Collections.swap(permutation, idx1, idx2);
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(4);//5 6 4 2 1 3
		list.add(2); // 2 3 1 4 5
		list.add(1);
		list.add(3);
		System.out.println(list);
		System.out.println(nextPermutation(list));

	}
}
