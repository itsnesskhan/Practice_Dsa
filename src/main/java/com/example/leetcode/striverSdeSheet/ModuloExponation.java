package com.example.leetcode.striverSdeSheet;

public class ModuloExponation {

	
	public static int modularExponentiation(int x, int n, int m) {
        int fi = x ^ n;
        System.out.println(fi);
        int sec = fi % m;
        System.out.println(sec);
        return fi>sec?sec:fi;
	}
	
	public static void main(String[] args) {
		System.out.println(modularExponentiation(4, 3, 2));
	}
}
