package com.example.multithreading;

public class MainThreadThenChildThread implements Runnable {
	
	private static Thread mainThread;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				mainThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public static void main(String[] args) {
		mainThread = Thread.currentThread();
		Thread childThread = new Thread(new MainThreadThenChildThread());
		childThread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
