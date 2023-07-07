package com.example.practice2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListContainsOnlyOddNumbers {

	public static void main(String[] args) {
		Stream<Integer> list = Stream.of(3,5,7,9);
		int size = list.filter(i->i%2==0).collect(Collectors.toList()).size();
		if (size==0) {
			System.out.println("list with all odd elements");
		}
		else {
			System.out.println("list contains even numbers as well");
		}
	}
}
