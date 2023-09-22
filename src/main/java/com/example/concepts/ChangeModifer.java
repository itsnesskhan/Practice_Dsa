package com.example.concepts;

class A {

	void run() {
		System.out.println("A's Run method");
	}
}

class B extends A {

	public void run() { // can make it public here but can't make it private as cannot reduce the
						// visibility of method here
		System.out.println("B's Run method");
	}
}

public class ChangeModifer {

	public static void main(String[] args) {
//		 B b =  new A();  wont work
//		A a = new B();  b's method will be called based on run tme object
//		a.run();

		B b = new B();
		b.run();
	}
}
