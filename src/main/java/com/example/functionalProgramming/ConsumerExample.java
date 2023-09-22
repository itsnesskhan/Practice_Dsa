package com.example.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		
		Employee employee1 = Employee.builder().id(101).name("Nasser Khan").salary(16000).build();
		Employee employee2 = Employee.builder().id(101).name("Mohit Sharma").salary(58000).build();
		Employee employee3 = Employee.builder().id(101).name("Saklen Khan").salary(21000).build();
		Employee employee4 = Employee.builder().id(101).name("Aakib Khan").salary(32000).build();
		Employee employee5 = Employee.builder().id(101).name("Emraan Khan").salary(19000).build();
		
		List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
		
		Consumer<Employee> printEmployees = employee -> System.out.println(employee);
		
		employees.forEach(printEmployees);
	}
}
