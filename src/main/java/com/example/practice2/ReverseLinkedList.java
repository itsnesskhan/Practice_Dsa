package com.example.practice2;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(45);
		list.add(89);
		list.add(56);
		LinkedList<Integer> revLinkedList = new LinkedList<>();
		list.descendingIterator().forEachRemaining(revLinkedList::add);
		System.out.println(list);
		System.out.println(revLinkedList);
	}
}
