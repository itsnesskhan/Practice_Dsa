package com.example.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintNameJob implements Runnable{

	private String name;
	
	public PrintNameJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name+" job started by "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" job completed by "+Thread.currentThread().getName());
	}
	
}

public class ExecuterServiceExample {
		
	public static void main(String[] args) {
		PrintNameJob[] printJob = {new PrintNameJob("Nasser"),
				new PrintNameJob("Jaime"),
				new PrintNameJob("Mohit"),
				new PrintNameJob("Akshay"),
				new PrintNameJob("Rohit"),
				new PrintNameJob("Manish")
				};

//there are six job to be done by our executer service

//		ExecutorService service = Executors.newSingleThreadExecutor();
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintNameJob printNameJob : printJob) {
			service.execute(printNameJob);
		}
		 service.shutdown();
	}
		
}
