package com.example.concepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	static class Key {
        String id;

        public Key(String id) {
            this.id = id;
        }
    }
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("HashMap Example:");

	    Map<Key, String> hashMap = new HashMap<>();
	    Key key1 = new Key("key1");
	    Key key2 = new Key("key2");

	    hashMap.put(key1, "value for key1");
	    hashMap.put(key2, "value for key2");

	    System.out.println("HashMap size: " + hashMap.size());

	    key1 = null; // No longer references the key1 object

	    // Perform garbage collection
	    System.gc();

	    // Allow some time for garbage collection to take effect
	    Thread.sleep(1000); // Sleep for 1 second

	    System.out.println("HashMap size after GC: " + hashMap.size());
	    
	    Set<Map.Entry<Key, String>> map = hashMap.entrySet();
        for (Map.Entry<Key, String> entry : map) {
			System.out.println("key "+entry.getKey() +" value "+entry.getValue());
		}
	}
}
