package com.example.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountChar {
	
	public static HashMap<Character, Integer> countOcurrence(String string){
		
		char[] array = string.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (char c : array) {
			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			}else {
				hashMap.put(c, 1);
			}
		}
		return hashMap;
	}
	
	public static void main(String[] args) {
		String string = "NASSER KHAN";
		HashMap<Character,Integer> countOcurrence = countOcurrence(string);
		System.out.println(countOcurrence);
		 
		ArrayList<Object> list = new ArrayList<>(List.of("Nasser", "Mohit","Rohit","Mohit","Mohit","Rohit"));
		Map<Object,Long> collect = list.stream().collect(Collectors.groupingBy(emp-> emp, Collectors.counting()));
		System.out.println(collect);
		
		String s1 = "Nasser";
		String s2 = "Khan";
		
		s1 = s1.concat(s2);
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("s1 "+s1);
		System.out.println("s2 "+s2);
	}

}
