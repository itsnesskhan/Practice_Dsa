package com.example.threads;

import lombok.AllArgsConstructor;
import lombok.Data;


public class ThreadPractice {
	
	static class Mythread implements Runnable{

		public int start;
		public int end;
		
		
		
		public Mythread(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {
			for (int i = start; i <=end; i++) {
				System.out.print(i+" ");
			}
			
			
		}
	}	
		public static void main(String[] args) throws InterruptedException {
			Mythread mythread = new Mythread(1,10);
			Mythread mythread2 = new Mythread(11,20);
			Thread thread = new Thread(mythread);
			Thread thread2 = new Thread(mythread2);
			thread.start();
			thread.join();
			thread2.start();
			
	}
	
}
