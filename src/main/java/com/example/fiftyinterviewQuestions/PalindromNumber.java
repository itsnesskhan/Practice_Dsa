package com.example.fiftyinterviewQuestions;

public class PalindromNumber {
	
	private static boolean isPalindrome(int number) {
		int sum = 0;
		int num = number;
		int r = 0;
		while (number>0) {
			r = number%10;
			sum = sum*10 + r;
			number = number/10;
		}
		return sum == num;
	}
	
	public static void main(String[] args) {
		int number = 121;
		System.out.println(isPalindrome(number));
		
		String name = "  Nasser Khan  ";
		name = name.strip(); //removing both left and right side space
		System.out.println("Hii"+name+"your welcome..");
	}

	

}
