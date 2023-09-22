package com.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStratringWithS {
	
	public static void main(String[] args) {
		Stream<String> list = Stream.of("Nasser","Mohit","Sailesh","sorabh","Rohan","Shina");
		List<String> collect = list.filter(s->s.substring(0,1).equalsIgnoreCase("s")).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
