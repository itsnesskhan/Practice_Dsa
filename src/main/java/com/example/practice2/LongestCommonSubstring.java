package com.example.practice2;

import java.util.HashMap;

public class LongestCommonSubstring {

    static int longestCommonSubstr(String S1, String S2, int n, int m){
    	HashMap<String, Integer> mp = new HashMap<>();
      return lcs(S1, S2, 0,0,0,mp);
    }
    
    private static int lcs(String s1, String s2, int i, int j, int count, HashMap<String, Integer> mp) {
		if (i>= s1.length() || j>= s2.length()) {
			return count;
		}
		int same = count;
		
		String key = i+"c"+j+"j"+count;
		if (mp.containsKey(key)) {
			return mp.get(key);
		}
		
		if(s1.charAt(i)== s2.charAt(j)) {
			same = lcs(s1, s2, ++i, ++j, count+1,mp);
		}
		
		int diff1 =  lcs(s1, s2, ++i,j,0,mp);
		int diff2 = lcs(s1, s2, i, ++j, 0,mp);
		
		int res = Math.max(same, Math.max(diff1, diff2));
		mp.put(key, res);
		return res;
	}

	public static void main(String[] args) {
//    	String S1 = "ABCDGH", S2 = "ACDGHR";
    	String S1 = "ADAC", S2 = "ADADAC";
    	
    	int n = 6, m = 6;
    	int longestCommonSubstr = longestCommonSubstr(S1, S2, n, m);
    	System.out.println(longestCommonSubstr);
	}
}
