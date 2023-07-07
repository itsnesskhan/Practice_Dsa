package com.example.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShowWordsWithLengthTCS {
	

	public static void main(String[] args) {
		String string = "i m not okk to bee your partener you bitch";
		
		String[] split = string.split("\\s");
		System.out.println(Arrays.toString(split));
//		Arrays.stream(split).forEach(System.out::println);
		
		Map<Integer, List<String>> collect = Arrays.stream(split).collect(Collectors.groupingBy(str->str.length()));
		System.out.println(collect);
		
		
	}
}
