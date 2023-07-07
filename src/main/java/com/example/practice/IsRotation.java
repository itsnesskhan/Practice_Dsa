package com.example.practice;

public class IsRotation {
	
	public static boolean isRotation(String str1, String str2) {
		return (str1.length()== str2.length() && (str1+str2).indexOf(str2) != -1);
	}

	public static void main(String[] args) {
		String str1= "ABCD";
		String str2= "CDAB";
		if (isRotation(str1, str2)) {
			System.out.println("ROTATIONG IS PRESEND");
		}
		else {
			System.out.println("ROTATION NOT FOUND");
		}
	}
}
