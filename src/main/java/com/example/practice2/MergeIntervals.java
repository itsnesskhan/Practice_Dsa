package com.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

class Interval {
    int start; int finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

	@Override
	public String toString() {
		return "[" + start + ", " + finish + "]";
	}

    
    
}

public class MergeIntervals {

    public static List<Interval> mergeIntervals(Interval[] intervals) {
        
    	Stack<Interval> res = new Stack<>();

        Arrays.sort(intervals,new Comparator<Interval>() {
            
            public int compare(Interval i1, Interval i2){
                return i1.start - i2.start;
            }

        });
        

        res.push(intervals[0]);

        for(int i=1; i<intervals.length;i++){

            Interval top = res.peek();

            if(top.finish < intervals[i].start ){
                res.push(intervals[i]);
            }
            else if(top.finish < intervals[i].finish){
                top.finish = intervals[i].finish;
                res.pop();
                res.push(top);
            }
        }


        return new ArrayList<>(res);
    }
    
    public static void main(String[] args) {
    	  Interval arr[]=new Interval[7];
          arr[0]=new Interval(2,3);  
          arr[1]=new Interval(2,2);
          arr[2]=new Interval(3,3);
          arr[3]=new Interval(1,3);
          arr[4]=new Interval(5,7);
          arr[5]=new Interval(2,2);
          arr[6]=new Interval(4,6);
          List<Interval> mergeIntervals = mergeIntervals(arr);
          System.out.println(mergeIntervals);

	}
}
