package com.example.practice;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		int i=str.length()-1;
		for (int j = 0; j < str.length()/2; j++) {
			
			if (str.charAt(i) != str.charAt(j)) {
				return false;
				
			}
			i--;
		}
		return true;
	}
	
	public static boolean isPalindromeInteger(Integer number) {
		int sum=0;
		int r=0;
		int temp=number;
		
		while (number>0) {
			
			r= number%10;
			sum = sum*10 + r;
			number/=10;
		}
		System.out.println(sum);
		if (temp== sum) {
			System.out.println("Palindorme");
		}
		else {
			System.out.println("not Palindrome");
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		String string = "ABAC";
		Integer integer = 12145;
		boolean palindrome = isPalindrome(string);
		System.out.println(palindrome);
		isPalindromeInteger(integer);
		
		
		
	}

}
