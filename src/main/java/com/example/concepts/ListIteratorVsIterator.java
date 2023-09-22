package com.example.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorVsIterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Nasser","Mohit","Ayush","Rohit"));
		Iterator<String> iterator = list.iterator();
		
//		iterator
//		while (iterator.hasNext()) {
//			
//			String name = iterator.next();
//			if (name.equals("Nasser")) {
//				iterator.remove();
//			}
//		}
		
//		listiterator
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String next = listIterator.next();
			if (next.equals("Nasser")) {
				listIterator.add("Zoya");
			}
			if (next.equals("Mohit")) {
				listIterator.set("Mohit Malve");
			}
			
			if (next.equals("Rohit")) {
				listIterator.remove();;
			}
		}
		
		System.out.println(list);
		
	}
}
