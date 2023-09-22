package com.example.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
class Employee{
	private int id;
	private String name;
	private long salary;
}

public class PredicateExmple {

	public static void main(String[] args) {
		
		Predicate<Integer> evenValueOnly = num-> num%2==0;
		
		List<Integer> list = Arrays.asList(4,6,2,7,4,2,7,3);
		List<Integer> onlyEvenElements = list.stream().filter(evenValueOnly).collect(Collectors.toList());
		System.out.println(onlyEvenElements);
		
		Employee employee1 = Employee.builder().id(101).name("Nasser Khan").salary(16000).build();
		Employee employee2 = Employee.builder().id(101).name("Mohit Sharma").salary(58000).build();
		Employee employee3 = Employee.builder().id(101).name("Saklen Khan").salary(21000).build();
		Employee employee4 = Employee.builder().id(101).name("Aakib Khan").salary(32000).build();
		Employee employee5 = Employee.builder().id(101).name("Emraan Khan").salary(19000).build();
		
//		employee with salary greater then 20000rs.
		
		Predicate<Employee> employeeWithGreaterSalary = emp-> emp.getSalary()>20000;
		
		List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
		List<Employee> employeesWithGraterSalary = employees.stream().filter(employeeWithGreaterSalary).collect(Collectors.toList());
		employeesWithGraterSalary.forEach(System.out::println);
		
	}
}
