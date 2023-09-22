package com.example.fiftyinterviewQuestions;

public class ReverseString {
	
	private static StringBuilder reverse(String str) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			stringBuilder.append(str.charAt(i));
		}
			
		return stringBuilder;
	}
	
	public static void main(String[] args) {
		String str = "123";
		String str1 = "Nasser Khan";
		System.out.println(reverse(str));
		System.out.println(reverse(str1));
	}

	

}
