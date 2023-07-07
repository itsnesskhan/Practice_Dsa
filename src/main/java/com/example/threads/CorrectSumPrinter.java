package com.example.threads;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import lombok.Data;

@Data
class SumCounter implements Runnable{
	
	Integer total=0;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			total+=10;
		}
//		System.out.println(total);
	}
	
}

public class CorrectSumPrinter {
	
	
	public static void main(String[] args) throws InterruptedException {
		SumCounter sumCounter = new SumCounter();
		Thread thread = new Thread(sumCounter);
		thread.start();
//		thread.join();
		Thread currentThread = Thread.currentThread();
		currentThread.join();
		System.out.println(currentThread.getName());
		System.out.println(sumCounter.total);
		
	}

}
