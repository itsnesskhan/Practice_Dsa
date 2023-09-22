package com.example.concepts;

import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		
		IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
		String key1 = "Nasser";
		String key2 = new String("Nasser");
		String key3 = new String("Nasser");

		identityHashMap.put(key1, 101);
		identityHashMap.put(key2, 102);
		identityHashMap.put(key3, 103);
		
		System.out.println("SIZE : "+identityHashMap.size());
	}
}
