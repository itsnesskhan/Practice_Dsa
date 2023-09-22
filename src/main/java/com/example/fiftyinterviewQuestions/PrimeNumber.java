package com.example.fiftyinterviewQuestions;

public class PrimeNumber {

	private static boolean isPrime(int i) {
		if (i==0 || i ==1 )
			return false;
		
		if(i==2)
			return true;
		
		for (int j = 2; j <=i/2; j++) {
			if (i%j==0) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		System.out.println(isPrime(19)); // true
		System.out.println(isPrime(49)); // false
		System.out.println(isPrime(48)); // false
	}

}
