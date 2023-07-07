package com.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {

	private Integer id;
	private String name;
	private Integer experience;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(Integer id, String name, Integer experience) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;

	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", experience=" + experience + "]";
	}

}

public class EmployeeMaping {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Nasser", 2);
		Employee employee4 = new Employee(102, "Nasir", 2);
		Employee employee2 = new Employee(103, "Mohit", 3);
		Employee employee3 = new Employee(104, "Ayush", 5);

		ArrayList<Employee> list = new ArrayList<>(Arrays.asList(employee, employee2, employee3, employee4));
		
		Map<Integer, String> map = list.stream().filter(e -> e.getExperience() > 1 && e.getExperience() < 3)
				.collect(Collectors.toMap(e -> e.getId(), e -> e.getExperience()+" "+e.getName()));
		System.out.println(map);

	}
}
