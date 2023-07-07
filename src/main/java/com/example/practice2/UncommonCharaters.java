package com.example.practice2;

import java.util.HashMap;

public class UncommonCharaters {
	
    static String UncommonChars(String A, String B)
    {
        String res="";
        
        int has_a[] = new int[26];
        int has_b[] = new int[26];
        
        for (int i = 0; i < A.length(); i++) {
        	System.out.println(A.charAt(i)-'a');
			has_a[A.charAt(i)-'a'] =1;
		}
        
        for (int i = 0; i < B.length(); i++) {
			has_b[B.charAt(i)-'a'] = 1;
		}
        
        
        for (int i = 0; i < 26; i++) {
			if ((has_a[i]^has_b[i])!=0) {
				res+= (char)('a'+i);
			}
        	
		}
        
        return (res.length()==0)?"-1":res;
    }
    
    public static int minIndexChar(String str, String patt)
    {
    	int minIndex=Integer.MAX_VALUE;
    	int currentIndex= 0;
        for (int i = 0; i < str.length(); i++) {
			if (patt.indexOf(str.charAt(i))!=-1) {
				currentIndex=i;
				minIndex = Math.min(currentIndex, minIndex);
			}
		}
        return minIndex;
    }
    
    public static int minIndexCharOptamized(String str, String patt)
    {
    	int minIndex=Integer.MAX_VALUE;
    	HashMap<Character, Integer> map = new HashMap<>();
    	int currentIndex= 0;
        for (int i = 0; i < str.length(); i++) {
        	if (!map.containsKey(str.charAt(i))) {
        		map.put(str.charAt(i), i);        	
			}
		}
        
        System.out.println(map);
        for (int i = 0; i < patt.length(); i++) {
			if (map.containsKey(patt.charAt(i)) && map.get(patt.charAt(i))<minIndex) {
				currentIndex=map.get(patt.charAt(i));
				minIndex = Math.min(currentIndex, minIndex);
				System.out.println(minIndex);
			}
		}
        
        if (minIndex != Integer.MAX_VALUE)
            return minIndex;
        else
            return -1;
    }
    
    public static void main(String[] args) {
    	String A = "geeksforgeeks";
    	String	B = "geeksquiz";
    	String uncommonChars = UncommonChars(A, B);
    	System.out.println(uncommonChars);
    	
    	String str = "geeksforgeeks";
    	String patt = "set";
    	int minIndexCharOptamized = minIndexCharOptamized(str, patt);
    	System.out.println(minIndexCharOptamized);
    	
    	

	}

}
