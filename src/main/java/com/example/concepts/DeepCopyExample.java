package com.example.concepts;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Student implements Cloneable{
	 
	private int id;
	private String name;
	private int age;
	private List<String> phoneNumber;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class DeepCopyExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("9713216901");
		numbers.add("7987670697");
		Student student = new Student(101, "Nasser Khan", 24, numbers );
		Student student2 = student;
//		student2.setName("Emraan Khan");
		
		System.out.println("-----------------Shallow copy example----------------------");
		System.out.println(student);
		System.out.println(student2);
		
		System.out.println("----------------Deep copy example-----------------------");
		Student student3 = (Student) student.clone();
//		student3.getPhoneNumber().add("9754631908");
		
		student3.setPhoneNumber(new ArrayList<>(numbers));
		student3.getPhoneNumber().add("9754633333");
		student3.setName("Jaime Lennister");

		System.out.println("Student1 "+student);
		System.out.println("Student2 "+student2);
		System.out.println("Student3 "+student3);
	}
}
