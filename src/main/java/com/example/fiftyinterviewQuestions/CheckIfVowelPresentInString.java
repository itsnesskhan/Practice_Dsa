package com.example.fiftyinterviewQuestions;

public class CheckIfVowelPresentInString {
	
	private static boolean stringContainsVowels(String string) {
		return string.toLowerCase().matches(".*[aeiou].*");
	}
	
	public static void main(String[] args) {
		System.out.println(stringContainsVowels("LLYd")); // true
		System.out.println(stringContainsVowels("TVF Fucker")); // false
	}

	

}
