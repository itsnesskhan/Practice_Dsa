package com.example.practice2;

import java.util.ArrayList;
import java.util.List;

public class SearchInRowColumnSortedMatrix {

	public static boolean searchInRowColumnSortedMatrix(int[][] arr, int key) {
		int ans = -1;
		int row =0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i][0]==key) {
				return true;
			}
			else if(arr[i][0]> key) {
				row = i-1;
				break;
			}
			else {
				row = i;
			}
		}
		
		if (row>=0) {
			for(int i=0;i<arr[row].length;i++) {
				if(arr[row][i]==key) {
					return true;
				}
			}
		}
		
		
		return false;
	}
	
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		int targetRow =0;
		for(int i=0;i<m;i++){
			if(mat.get(i).get(0) == target){
				return true;
			}
			else if(mat.get(i).get(0)>targetRow){
				targetRow =i-1;
			}
			else{
				targetRow = i;
			}
		}

		for(int i=0;i<n;i++){
			if(mat.get(targetRow).get(i) == target){
				return true;
			}
		}

		return false;
	}
	
	public static void main(String[] args) {
		int[][] arr = {
				{3,12,17},
				{21,28,32},
				{35,41,54}
		}; 
		
		ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();

        // Create and add inner ArrayLists to the outer list
        ArrayList<Integer> innerList1 = new ArrayList<>();
        innerList1.add(3);
        innerList1.add(12);
        innerList1.add(17);
        outerList.add(innerList1);

        ArrayList<Integer> innerList2 = new ArrayList<>();
        innerList2.add(21);
        innerList2.add(28);
        innerList2.add(32);
        outerList.add(innerList2);

        ArrayList<Integer> innerList3 = new ArrayList<>();
        innerList3.add(35);
        innerList3.add(41);
        innerList3.add(54);
        outerList.add(innerList3);
		
		
		boolean sortedMatrix = searchInRowColumnSortedMatrix(arr, 35);
		boolean findTargetInMatrix = findTargetInMatrix(outerList, 3, 3, 41);
		System.out.println(findTargetInMatrix);
		System.out.println(sortedMatrix);
		
		
	}
}
