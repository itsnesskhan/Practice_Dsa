package com.example.fiftyinterviewQuestions;

public class FibinochiSequence {
	
	private static void printFib(int i) {
		int first = 0;
		int second = 1;
		int next = 0;
		
		for(int j=0;j<=i;j++) {
			
			System.out.print(first+" ");
			
			next = first+second;
			first = second;
			second = next;
		}
		
	}
	
	private static int printFibRecursion(int number) {
		if(number<=1) {
			return number;
		}
		
		return printFibRecursion(number-1)+printFibRecursion(number-2);
	}

	
	public static void main(String[] args) {
		printFib(10);
		System.out.println();
		
		for (int i = 0; i <= 10; i++) {
			System.out.print(printFibRecursion(i)+" ");
		}
	}

	
}
