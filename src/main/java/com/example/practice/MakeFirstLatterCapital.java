package com.example.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MakeFirstLatterCapital {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("nasser");
		list.add("surya");
		list.add("akshay");
		
		
		List<String> names = list.stream().map(name->name.substring(0, 1).toUpperCase().concat(name.substring(1))).collect(Collectors.toList());
		System.out.println(names);
	}
}
