package com.example.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class PrintNameJob2 implements Callable<Integer>{

	private int num;
	
	public PrintNameJob2(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
			System.out.println(Thread.currentThread().getName()+" responsible for finding sum of "+num+" natural numbers");
			int sum =0;
			for (int i = 1; i <= num; i++) {
				sum+=i;
			}
		return sum;
	}
	
}

public class ExecuterServiceCallable {
		
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		PrintNameJob2[] printJob = {new PrintNameJob2(5),
				new PrintNameJob2(12),
				new PrintNameJob2(8),
				new PrintNameJob2(9),
				new PrintNameJob2(14),
				new PrintNameJob2(21)
				};

//there are six job to be done by our executer service

//		ExecutorService service = Executors.newSingleThreadExecutor();
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintNameJob2 printNameJob : printJob) {
			Future<Integer> submit = service.submit(printNameJob);
			System.out.println(submit.get());
		}
		
		service.shutdown();
	}
		
}
