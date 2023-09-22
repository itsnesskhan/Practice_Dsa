package com.example.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

	public static void main(String[] args) {
		
		Employee employee1 = Employee.builder().id(101).name("Nasser Khan").salary(16000).build();
		Employee employee2 = Employee.builder().id(101).name("Mohit Sharma").salary(58000).build();
		Employee employee3 = Employee.builder().id(101).name("Saklen Khan").salary(21000).build();
		Employee employee4 = Employee.builder().id(101).name("Aakib Khan").salary(32000).build();
		Employee employee5 = Employee.builder().id(101).name("Emraan Khan").salary(19000).build();
		
		List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
		
		Function<Employee, Long> AllSalary = emp-> emp.getSalary();
		
		List<Long> onlySalaries = employees.stream().map(AllSalary).collect(Collectors.toList());
		System.out.println(onlySalaries);
		
		Function<Employee,Map<String, Long >> SalaryMap = emp-> Map.of(emp.getName(), emp.getSalary());
		
		List<Map<String, Long>> salMap= employees.stream().map(SalaryMap).collect(Collectors.toList());
		salMap.stream().forEach(System.out::println);
	}
}
