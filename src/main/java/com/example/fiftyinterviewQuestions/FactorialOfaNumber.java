package com.example.fiftyinterviewQuestions;

public class FactorialOfaNumber {
	
	private static int findFactorial(int number) {
		int fact = 1;
		if (number == 0 || number == 1) {
			return 1;
		}
		for(int i= 1;i<=number;i++) {
			fact*=i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		int number  = 5;
		int factorial = findFactorial(number);
		System.out.println(factorial);
	}

	
	
}
