package com.example.concepts;

public class OverloadingConcept {

	public static void main(String[] args) {
		OverloadingConcept m = new OverloadingConcept();
		System.out.println(m.get("Hello"));
		System.out.println(m.get(null));
	}

	public String get(String s) {
		return "String";

	}

	public String get(Object o) {
		return "Object";
	}
}

//In Java, method
//
//resolution (which method gets called) is determined at compile-time based on the reference type, not the actual object type. In your code, you have two overloaded methods:
//
//get(String s)
//
//and get(Object o).
//
//Let's analyze the calls:
//
//System.out.println(m.get("Hello"));
//Here, you are passing a String literal "Hello" as an argument. Since there is an exact match for a String parameter (get(String s)),
//
//the get(String s) method will be called. It's an exact match, so it takes precedence over the more general get(Object o) method.
//
//System.out.println(m.get(null));
//Here, you are passing null as an
//
//argument. Both get(String s)
//
//and get(Object o) can accept null because null is compatible with both String and Object. However, Java will always choose the most specific method that matches the argument type at compile-time. In this case,
//
//get(String s) is more specific than
//
//get(Object o) because it directly matches the argument type null (which can be considered as a type of String as well),
//
//so get(String s) will be called.