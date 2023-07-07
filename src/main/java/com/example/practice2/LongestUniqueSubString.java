package com.example.practice2;

import java.util.HashMap;
import java.util.HashSet;

public class LongestUniqueSubString {

	public static int uniqueSubstrings(String input) 
    {
		String ans = "";
		int len=0;
		int maxLen = 0;
		for(int i=0;i<input.length();i++){
			if(ans.indexOf(input.charAt(i))==-1){
				ans+=input.charAt(i);
				len++;
				maxLen = Math.max(maxLen, len);
			}
			else{
				ans="";
				len = 0;
				ans+=input.charAt(i);
				len++;
				maxLen = Math.max(maxLen, len);
			}
			
		}
		return maxLen;
	}
	
	public static int uniqueLongestSubstringsAccurate(String input) 
    {
	
		int n = input.length();
		int len=0;
		int maxLen = 0;
		for(int i=0;i<n;i++) {
			
			StringBuilder currentSubstring = new StringBuilder();
			
			for(int j=i;j<n;j++) {
				
				if (currentSubstring.indexOf(String.valueOf(input.charAt(j)))!=-1) {
//					set.remove(input.charAt(j));
					break;
				}
				else {
					currentSubstring.append(input.charAt(j));
					len = currentSubstring.length();
					maxLen = Math.max(maxLen, len);
				}
			}
		}
		return maxLen;
	}
	
	public static int lengthOfLongestSubstringsOptimized(String input) 
    {
	
		int n = input.length();
		int len=0;
		int maxLen = 0;
		
		HashMap<Character,Integer> visited = new HashMap<>();
		
		for(int right=0, left =0;right<n;right++) {
			
			char currentCharacter = input.charAt(right);
															//character in given window
			if(visited.containsKey(currentCharacter) && visited.get(currentCharacter)>= left) {
				
				left = visited.get(currentCharacter)+1;
			}
			
			maxLen = Math.max(maxLen, right-left+1);
			visited.put(currentCharacter, right);
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
//		String input = "nasserkhan";
		String input = "qdbaszitlnniyayvgojnmlcjwmpnsrnlcrbkjaycurpzrhswguucjdezcmmddgyjgkjfrjqvymzuscpncfnoidrodcxerbygmmhgfunixdroyhzhraqdeinfxilodxzvgwklmfiozhewvticrxfyenbdesnhipqiufnyayloiizhfyjgaicakmsvfjfibppopovyifqnjexqnefatyxyauzuwfsxvfewgjdalhuqoszpngvrmgrxjmylnvhukkqvvnpzglhmkrnohayufmcdzumoolikxyuzywtbxbjpdgvdxraheoclpllfoxofspnfpuvpsgnaneefinfbwiivfyfqabsxqutqgvjlbjtwgudxhnvklftftvxyyhzybybwozjmrmuhizdtjwtqlwxalmrbawdzaovekiovnucefttmwgjmfzjvwyeeijemwvxpojkhchznbuywkjzlbiflcogqfvfhehvswkdvqsxqtytpxiwrwixadpyknqdopbaknvxsgvimhciwklhwwpajilaothdibsimfkhrqlysymbccbkrurnimqkeadihmqticquxnlqjfxusxscqktafolecwydrmotozevofwtcfuqkfzmmxcsabqjezaizeewxomosgaldtuqqecaxqbhnfejrtdsbpfadnilgwmmyiyiqqtfhczjgmysvtytavvqmrlydlgtyvxcoimdeyajfaxokmkemckzlxdqfcqphqqsuiptryozbuimbjmtlclftnacbeflirspvezwxvbtszhklmwefpbpophgfwzztmkvanlrhdfmafjtmwtiwibdkpbgyfmiervjlxfsyrlmhrpgrsajtqxcmxxkbwozvkoicdxhqfewoxjyfzciangmhdzjnifteqhleopkgzaqkzgbhmeulehsbzjbjqkrujvlpmdqidapwbnhshbfmuzgeabwsscrhjvgggiesfzfgugvfbqelseycxrllixdg";
		int uniqueSubstrings = uniqueLongestSubstringsAccurate(input);
		System.out.println(uniqueSubstrings);
	}
}
