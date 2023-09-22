package com.example.fiftyinterviewQuestions;

class MyInteger{
	int value;

	public MyInteger(int value) {
		this.value = value;
	}

	@Override
    public String toString() {
        return Integer.toString(value);
    }
	
	
}

public class SwapTwoNumberWithoutThridVariable {

	private static void swapPassByValue(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("a : = "+a+" and b : = "+b);
	}

	private static void swapPassByReferenceWithInbuildClasses(Integer x, Integer y) {
		x = x.intValue() ^ y.intValue();
		y = x.intValue() ^ y.intValue();
		x = x.intValue() ^ y.intValue();
	}
	
	private static void swapPassByReferenceWithCustomClasses(MyInteger x, MyInteger y) {
	    int temp = x.value;
	    x.value = y.value;
	    y.value = temp;
	}


	public static void main(String[] args) {
		int a = 120;
		int b = 45;
		System.out.println("************************************************\n");
		System.out.println("a : = " + a + " and b : = " + b + " before");
		swapPassByValue(a, b); // we passing value of a and b not reference so, there value changed locally in
								// swap method but actual value remain unchanged in main method
		// java does not support passByRefrence for primitive types, to achieve it use
		// array, or object;
		System.out.println("a : = " + a + " and b : = " + b + " after");

		Integer x = Integer.valueOf(10);
		Integer y = Integer.valueOf(20);

		System.out.println("************************************************\n");
		System.out.println("x : = " + x + " and y : = " + y + " before");
		
		swapPassByReferenceWithInbuildClasses(x, y);
		/*
		 * you cannot use the built-in Integer class to achieve pass-by-reference
		 * behavior because in Java, primitive wrapper classes like Integer are
		 * immutable. This means that you cannot change the value of an Integer object
		 * once it's created. When you pass an Integer object to a method and modify it
		 * within that method, you're actually creating a new Integer object with a
		 * different value.
		 */
		System.out.println("x : = " + x + " and y : = " + y + " after");
		
		System.out.println("************************************************\n");
		
		MyInteger integer1 = new MyInteger(10);
		MyInteger integer2 = new MyInteger(20);
		System.out.println("integer1 : = " + integer1 + " and integer2 : = " + integer2 + " befor");
		swapPassByReferenceWithCustomClasses(integer1, integer1);
		
		System.out.println("integer1 : = " + integer1 + " and integer2 : = " + integer2 + " after");
		// to achieve changes we need to pass by refrerace for that we need to pass array of this values

	}

}
