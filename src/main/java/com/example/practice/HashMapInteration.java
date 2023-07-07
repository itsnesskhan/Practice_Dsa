package com.example.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapInteration {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("Nasser", "Khan");
		map.put("Mohit", "Malve");
		map.put("Aayush", "Kushwah");
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry);
		}
		
		System.out.println("#######################################################");
		
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(string+" = "+map.get(string));
		}
		System.out.println("#######################################################");

		
		Iterator<String> iterator = map.keySet().iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key+" "+ map.get(key));
		}
		
		System.out.println("#######################################################");

		map.entrySet().stream().forEach(System.out::println);
		
		
	}
	

	
}
