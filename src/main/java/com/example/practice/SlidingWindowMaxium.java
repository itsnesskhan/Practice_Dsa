package com.example.practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;

public class SlidingWindowMaxium {
	
	public static void maxInGivenRange(int[] arr, int k) {
		
		int j,max;
		for (int i = 0; i <= arr.length-k; i++) {
			max = arr[i];
			
			for (j = 1; j < k; j++) {
				if (arr[i+j]>max) {
					max = arr[i+j];
				}
			}
			System.out.print(max+" ");
		}
	}
	
	public static ArrayList<Integer> maxInGivenRange2(int[] arr, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		ArrayList<Integer> res = new ArrayList<>();
		int i=0;
		
		for (; i < k; i++) {
			
			queue.add(arr[i]);
			
		}
		res.add(queue.peek());
		
		queue.remove((arr[0]));
		
		for (;  i< arr.length; ++i) {
			queue.add(arr[i]);
			
			res.add(queue.peek());
			
			queue.remove(arr[i-k+1]);
		}
		
		return res;
	}
	
	public static ArrayList<Integer> maxInGivenRange3(int[] arr, int k) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		ArrayList<Integer> res = new ArrayList<>();
		int i=0;
		
		for (; i < k; i++) {
			
			while (!deque.isEmpty() && arr[i]>= arr[deque.peekLast()]) {
				
				deque.removeLast();
			}
			
			deque.addLast(i);
			
		}
		
		for (;  i< arr.length; i++) {
			
			res.add(arr[deque.peek()]);
			
			while (!deque.isEmpty() && deque.peek() <= i-k) {
				deque.removeFirst();
			}
			
			while (!deque.isEmpty() && arr[i]>= arr[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.addLast(i);
			
		}
		res.add(arr[deque.peek()]);
		return res;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,2,8,1,9};
		maxInGivenRange(arr, 3);
		ArrayList<Integer> maxInGivenRange2 = maxInGivenRange2(arr, 3);
		System.out.println();
		System.out.println(maxInGivenRange2);
		ArrayList<Integer> maxInGivenRange3 = maxInGivenRange3(arr, 3);
		System.out.println(maxInGivenRange3);
	}
	
	

}
