



package com.example.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {

		System.out.println("COUNT BY DUPLICATES");
		ArrayList<Object> list = new ArrayList<>();
		list.add(45);
		list.add(9);
		list.add(35);
		list.add(78);
		list.add(45);
		list.add(45);
		list.add(9);

		Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(item -> item, Collectors.counting()));
		System.out.println(map);
		
		System.out.println("###################################################");
		
		System.out.println("GROUP BY DEPARTMENT");
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "Nasser Khan", 15000d, "IT"));
		emp.add(new Employee(104, "Mohit Kumrawat", 30000d, "CIVIL"));
		emp.add(new Employee(105, "Javed Khan", 210000d, "IT"));
		emp.add(new Employee(105, "Javed Khan", 20000d, "CIVIL"));
		emp.add(new Employee(103, "Vishal Sain", 25000d, "IT"));
		emp.add(new Employee(102, "Akshay Jain", 270000d, "IT"));
		
		Map<String, List<Employee>> listoMap= emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(listoMap);
		
		System.out.println("###################################################");
		
		System.out.println("AVERAGE SALARY OF AN EMPLOYEE");
		double averageSal = emp.stream().mapToDouble(employee->employee.getSalary()).average().getAsDouble();
		System.out.println(averageSal);
		
		System.out.println("Converting list of number into string");
		List<String> collect = list.stream().map(item->String.valueOf(item)).collect(Collectors.toList());
		System.out.println(collect);
		
	}
}
