package com.example.multithreading;

public class ThreadLocalExample{
	
	public static void main(String[] args) {
		ThreadLocal<String> threadLocal = new ThreadLocal<>() {
			
			public String initialValue() {
				return "Mohit";
			}
		};
		System.out.println(threadLocal.get());
		threadLocal.set("Nasser");
		System.out.println(threadLocal.get());
		threadLocal.remove();
		System.out.println(threadLocal.get());
	}

}
