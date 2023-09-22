package com.example.fiftyinterviewQuestions;

public class StringPalindrome {
	
	private static boolean isPalindome(String str) {
		int j = str.length()-1;
		for(int i=0;i<str.length()/2;i++) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "NassaN";
		System.out.println(isPalindome(str));
	}

	
}
