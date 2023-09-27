package com.example.multithreading;

class CustomerThread extends Thread{
	
	static int cusId;
	static ThreadLocal<Integer> local = new ThreadLocal<>() {
		protected Integer initialValue() {
			return ++cusId;
		}
	};
	
	public CustomerThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" with customer Id "+ local.get());
	}
	
	
	
	
}

public class ThreadLocalExample2 {
	
	public static void main(String[] args) {
		 
		new CustomerThread("Nasser").start();
		new CustomerThread("Mohit").start();
		new CustomerThread("Akshay").start();
		new CustomerThread("Ayush").start();
	}

}
