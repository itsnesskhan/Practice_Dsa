package com.example.leetcode.striverSdeSheet;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };
        
//        printMatrix(matrix);
//        rotateElementsInMatrixClockwise(4, 4, matrix);
//        System.out.println();
//        printMatrix(matrix);
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        	
        	ArrayList<Integer> temp = new ArrayList<>();
        	temp.add(1);
        	temp.add(2);
        	temp.add(3);
        	temp.add(4);
        	
        	list.add(temp);
        	
        	ArrayList<Integer> temp2 = new ArrayList<>();
        	temp2.add(5);
        	temp2.add(6);
        	temp2.add(7);
        	temp2.add(8);
        	
        	list.add(temp2);
        	
        	ArrayList<Integer> temp3 = new ArrayList<>();
        	temp3.add(9);
        	temp3.add(10);
        	temp3.add(11);
        	temp3.add(12);
        	
        	list.add(temp3);
        	
        	ArrayList<Integer> temp4 = new ArrayList<>();
        	temp4.add(13);
        	temp4.add(14);
        	temp4.add(15);
        	temp4.add(16);
        	
        	list.add(temp4);
        	
        	System.out.println(list);
        	rotateMatrix(list, list.size(), list.get(0).size());
        	System.out.println(list);
    }

    public static void rotateElementsInMatrixClockwise(int n, int m, int[][] mat) {
        int row = 0, col = 0;
        int prev, curr;
        int lastRow = n;
        int lastCol = m;
        while (row < lastRow && col < lastCol) {
            if (row + 1 == lastRow || col + 1 == lastCol) {
                break;
            }
            prev = mat[row + 1][col];
            // For the first row which is in bounds
            for (int i = col; i < lastCol; i++) {
                curr = mat[row][i];
                mat[row][i] = prev;
                prev = curr;
            }
            row++;
            // For the last column which is in bounds
            for (int i = row; i < lastRow; i++) {
                curr = mat[i][lastCol - 1];
                mat[i][lastCol - 1] = prev;
                prev = curr;
            }
            lastCol--;
            // For the last row which is in bounds
            if (row < lastRow) {
                for (int i = lastCol - 1; i >= col; i--) {
                    curr = mat[lastRow - 1][i];
                    mat[lastRow - 1][i] = prev;
                    prev = curr;
                }
            }
            lastRow--;
            // For the first row which is in bounds
            if (col < lastCol) {
                for (int i = lastRow - 1; i >= row; i--) {
                    curr = mat[i][col];
                    mat[i][col] = prev;
                    prev = curr;
                }
            }
            col++;
        }
    }
    
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        
    	int row = 0, col = 0, prev, curr;
    	int lastrow = n, lastcol = m;
    	
    	while (row<lastrow && col<lastcol) {
			
    		if ((row+1)== lastrow || (col+1) == lastcol) {
				break;
			}
    		
    		prev = mat.get(row+1).get(col);
    		
    		for(int i=col;i<lastcol;i++) {
    			
    			curr = mat.get(row).get(i);
    			mat.get(row).set(i, prev);
    			prev = curr;
    		}
    		row++;
    		
    		for(int i=row;i<lastrow;i++) {
    			curr = mat.get(i).get(lastcol-1);
    			mat.get(i).set(lastcol-1, prev);
    			prev = curr;
    		}
    		lastcol--;
    		
    		if (row<lastrow) {
				
    			for(int i = lastcol-1;i>=col;i--) {
    				curr = mat.get(lastrow-1).get(i);
        			mat.get(lastrow-1).set(i, prev);
        			prev = curr;
    			}
			}
    		lastrow--;
    		
    		if(col<lastcol) {
    			
    			for(int i=lastrow-1;i>=row;i--) {
    				
    				curr = mat.get(i).get(col);
        			mat.get(i).set(col, prev);
        			prev = curr;
    			}
    		}
    		col++;
    		
		}
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
