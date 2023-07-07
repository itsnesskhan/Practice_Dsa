package com.example.practice2;

import java.util.Arrays;

public class LongestPalindromeSting {

	
	
    static int longestPalin(String S){
    	
    	int lower[] = new int[26];
    	int upper[] = new int[26];
    	
    	for (int i = 0; i < S.length(); i++) {
			
    		char c = S.charAt(i);
    		// aski value of A is 65 while a is 97
    		if (c-97 >=0) {
				lower[c-97]++;
			}
    		else {
    			upper[c-65]++;
    		}
		}
    	System.out.println("woring");
    	System.out.println(Arrays.toString(lower));
    	System.out.println(Arrays.toString(upper));
    	
    	int ans =0;
    	boolean isFirstOdd = false;
    	
    	for (int i = 0; i <26; i++) {
			if (lower[i]%2==0) {
				ans+=lower[i];
			}
			else {
				if (isFirstOdd==false) {
					ans+=lower[i];
					isFirstOdd=true;
				}
				else {
					ans+=lower[i]-1;
				}
			}
		}
    	
    	for (int i = 0; i < 25; i++) {
			if (upper[i]%2==0) {
				ans+=upper[i];
			}
			else {
				if (isFirstOdd==false) {
					ans+=upper[i];
					isFirstOdd=true;
				}
				else {
					ans+=upper[i]-1;
				}
			}
		}
   
    	
    	return ans;
    }
    
    
    public static void main(String[] args) {
     String	S = "aaaabbaa";
//    	String S= "forgeeksskeegfor";
     	int longestPalin = longestPalin(S);
     	System.out.println(longestPalin);
	}
}
