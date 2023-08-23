package com.example.concepts;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapVsConCurrentHashMap {

	public static void main(String[] args) {
//		ConcurrentHashMap<Integer, String> h=new ConcurrentHashMap();   //will throw null pointer exception
		HashMap<Integer, String> h=new HashMap();   //will work
        h.put(100,"Stark");   
        h.put(101,"Michale");   
        h.put(102,"Ani");   
        h.put(null,"Sofia");   
        System.out.println(h);   
    }   
}
