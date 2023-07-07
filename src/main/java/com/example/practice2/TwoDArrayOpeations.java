package com.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pairss<K, V> {
    private final K key;
    private final V value;

    public Pairss(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

public class TwoDArrayOpeations {

	public static void main(String[] args) {
		List<Pairss<Integer, Integer>> PairssList = new ArrayList();
		PairssList.add(new Pairss<>(1, 2));
		PairssList.add(new Pairss<>(3, 4));
		PairssList.add(new Pairss<>(5, 6));

	
		int[][] PairsssArr = new int[PairssList.size()][2];

		for (int i = 0; i < PairssList.size(); i++) {
		   
		    int firstVal = PairssList.get(i).getKey();
		    int secondVal = PairssList.get(i).getValue();
		    
		    int[] PairssArr = new int[]{firstVal, secondVal};
		    
		
		    PairsssArr[i] = PairssArr;
		}

		// Print the 2D array
		for (int[] Pairss : PairsssArr) {
		    System.out.println(Arrays.toString(Pairss));
		}
	}
}
