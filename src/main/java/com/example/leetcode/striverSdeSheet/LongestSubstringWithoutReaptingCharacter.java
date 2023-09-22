package com.example.leetcode.striverSdeSheet;

import java.util.HashMap;

public class LongestSubstringWithoutReaptingCharacter {

	public static int lengthOfTheLongestSubstring(String string) {
		int maxLength = 0;

		for (int i = 0; i < string.length(); i++) {
			StringBuilder currentString = new StringBuilder();

			for (int j = i; j < string.length(); j++) {
				char currentChar = string.charAt(j);
				if (currentString.indexOf(String.valueOf(currentChar)) != -1) {
					break;
				}
				currentString.append(currentChar);
				maxLength = Math.max(maxLength, currentString.length());
			}
		}

		return maxLength;
	}

	public static int lengthOfTheLongestSubstringWithvisitedCharacters(String string) {
		int maxLength = 0;
		HashMap<Character, Integer> visitedCharacters = new HashMap<>();

		for (int right = 0, left = 0; right < string.length(); right++) {
			char currentChar = string.charAt(right);

			if (visitedCharacters.containsKey(currentChar) && visitedCharacters.get(currentChar) >= left) {
				left = visitedCharacters.get(currentChar) + 1;
			}

			maxLength = Math.max(maxLength, right - left + 1);
			visitedCharacters.put(currentChar, right);
		}

		return maxLength;
	}
	
	public static int lengthOfTheLongestSubstringOptimized(String string) {
		int maxLength = 0;

		for (int right = 0, left = 0; right < string.length(); right++) {
			int firstAppearanceOfCharacter = string.indexOf(string.charAt(right), left);
			
			if (firstAppearanceOfCharacter !=right) {
				left = firstAppearanceOfCharacter + 1;
			}

			maxLength = Math.max(maxLength, right - left + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		String string = "ABCCBADCD";
		int longestSubstring = lengthOfTheLongestSubstring(string);
		int longestSubstring2 = lengthOfTheLongestSubstringWithvisitedCharacters(string);
		int longestSubstring3 = lengthOfTheLongestSubstringOptimized(string);
		System.out.println(longestSubstring);
		System.out.println(longestSubstring2);
		System.out.println(longestSubstring3);
	}

}
