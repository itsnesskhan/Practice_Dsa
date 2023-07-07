package com.example.practice;

public class FindSpecialCharacter {

	public static void main(String[] args) {

		String string = "Intel$dk%@0 45$";
		int count = 0;

		for (int i = 0; i < string.length(); i++) {

			if (!Character.isDigit(string.charAt(i)) && !Character.isAlphabetic(string.charAt(i))
					&& !Character.isWhitespace(string.charAt(i))) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No special characters");

		} else {
			System.out.println(count + " special characters");
		}

	}

}
