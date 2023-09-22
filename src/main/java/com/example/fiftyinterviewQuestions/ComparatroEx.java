package com.example.fiftyinterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import lombok.ToString;

@ToString
class Emp {
	   private String name;
	   private int age;

	   public Emp(String name, int i){
		this.name = name;
		this.age = i;
		}
	   
	   

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
		
	}

public class ComparatroEx {
	    public static void main(String[] args) {
	        System.out.println("Hello, World!");
	        Emp emp = new Emp("N", 24);
		    Emp emp2 = new Emp("S", 23);
		    Emp emp3 = new Emp("A",34);
		    ArrayList<Emp> employess = new ArrayList<>(Arrays.asList(emp, emp2, emp3));
		    System.out.println(employess);

		    Collections.sort(employess, (a,b)-> a.getAge()<b.getAge()?-1:a.getAge()>b.getAge()?1:0);
		    System.out.println(employess);

	    }
	}