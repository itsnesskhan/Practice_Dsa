package com.example.practice2;

public class PrintAllPermutations {

	public static void printPerm(String string,String permution) {
		
		if (string.length() == 0) {
			System.out.println(permution);
			return;
		}
		
		for (int i = 0; i < string.length(); i++) {
			char charAt = string.charAt(i);
			
			String remainging = string.substring(0,i)+string.substring(i+1);
			printPerm(remainging, permution+charAt);
		}
	}
	
	public static void main(String[] args) {
		printPerm("ABC", "");
	}
}
