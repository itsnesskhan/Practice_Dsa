package com.example.fiftyinterviewQuestions;

public class RemoveWhitSpace {
	
	private static StringBuilder removeWhiteSpace(String str) {
		StringBuilder builder = new StringBuilder();
		
		char[] charArray = str.toCharArray();
		
		for (char c : charArray) {
			if (!Character.isWhitespace(c)) {
				builder.append(c);
			}
		}
		
		return builder;
	}
	
	public static void main(String[] args) {
		String str = "  Nasser Khan ";
		
		String string = str.trim();
		System.out.println("first way :  "+string);
		
		StringBuilder removeWhiteSpace = removeWhiteSpace(str);
		System.out.println("second way : "+removeWhiteSpace);
		
		String newStr = "";
		String[] split = str.split("\s");
		for (String string2 : split) {
			newStr+=string2;
		}
		
		System.out.println("third way : "+newStr);
	}

	

}
