package com.example.concepts;

import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import lombok.ToString;

public class WeakHashMapExample {
	
	@ToString
	 static class Key {
	        String id;

	        public Key(String id) {
	            this.id = id;
	        }
	    }

	public static void main(String[] args) throws InterruptedException {
		WeakHashMap<Key, String> weakHashMap = new WeakHashMap<>();   
		Key key1 = new Key("key1");
		Key key2 = new Key("key2");
		
		weakHashMap.put(key1,"value for key1");
		weakHashMap.put(key2,"value for key2");
        
		System.out.println("weakMap size "+weakHashMap.size());
		
		key1 = null; //weark refrence
		
		  Thread.sleep(1000); // Sleep for 1 second

	        // Perform garbage collection
	        System.gc();

	        // Allow some time for garbage collection to take effect
	        Thread.sleep(1000); // Sleep for 1 second

		
		System.out.println("weakMap size "+weakHashMap.size());
		
        Set<Map.Entry<Key, String>> map = weakHashMap.entrySet();
        for (Map.Entry<Key, String> entry : map) {
			System.out.println("key "+entry.getKey() +" value "+entry.getValue());
		}
        

	}
}
