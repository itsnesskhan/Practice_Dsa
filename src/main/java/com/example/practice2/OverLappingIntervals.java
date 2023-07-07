package com.example.practice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Stack;

public class OverLappingIntervals {

	class interval{
		int start;
		int end;
		
		public interval(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}

		@Override
		public String toString() {
			return " [" + start + ","+ end + "]";
		}
		
		
		
	}
	
    public int[][] overlappedInterval(int[][] Intervals)
    {

        Arrays.sort(Intervals, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]- o2[0];
			}
        	
		});
        
  
        
        Stack<interval> stack = new Stack<>();
        
        stack.push(new interval(Intervals[0][0], Intervals[0][1]));
        
        for (int i = 1; i < Intervals.length; i++) {
				
        		interval top = stack.peek();
        		
        		if (top.end< Intervals[i][0]) {
    				stack.push(new interval(Intervals[i][0], Intervals[i][1]));
    			}
        		else if(top.end<Intervals[i][1]) {
        			top.end = Intervals[i][1];
        			stack.pop();
        			stack.push(top);
        		}
		}
        
        
       int[][] ans =  new int[stack.size()][2];
        
        for (int i = 0; i < stack.size(); i++) {
			
        	int start = stack.get(i).start;
        	int end = stack.get(i).end;
        	
        	int[] anss= new int[]{start, end};
        	
        	ans[i] = anss;
		}
    	
    	return ans;
    }
    
    public static void main(String[] args) {
    	int arr[][] = {
    			{1,3},
    			{6,8},
    			{2,4},
    			{9,10}
    	};
    	OverLappingIntervals intevals = new OverLappingIntervals();
    	int[][] overlappedInterval = intevals.overlappedInterval(arr);
    	for (int[] is : overlappedInterval) {
			System.out.println(Arrays.toString(is));
		}
    	}
    
    
}
