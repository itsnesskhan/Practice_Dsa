package com.example.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AutomicIntegerExample {
	
	static int count = 1;
	static AtomicInteger counter = new AtomicInteger(1);
	
	public static void main(String[] args) throws InterruptedException {
		
		
		new Thread(()->{
				count++;				
			counter.incrementAndGet();
		}).start();
		
		new Thread(()->{
				count++;				
			counter.incrementAndGet();
		}).start();
		
		
		System.out.println("Normal Integer Value : "+count);
		System.out.println("Automic Integer Value : "+counter.get());
		
		//when we perform compound operation in mutithreaded enviormetn we want both operation to be perform in one go
		//cause we perfrom two operation in one go
	}

}
