package com.example.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class DisplayWelcome2{
	
	ReentrantLock reentrantLock = new ReentrantLock();
	
	public void display() throws InterruptedException {
		
		if (reentrantLock.tryLock(2000,TimeUnit.MILLISECONDS)) {

			for (int i = 0; i < 5; i++) {
				System.out.print("Welcome : ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
			}
		}
		else {
			for (int i = 0; i < 5; i++) {
				System.out.println("unable to get the lock, so i m doing my work now");
			}
		}
		
	}
}

class MaThread2 extends Thread{
	
	private DisplayWelcome2 displayWelcome;
	
	public MaThread2(String name, DisplayWelcome2 displayWelcome) {
		super(name);
		this.displayWelcome = displayWelcome;
	}



	@Override
	public void run() {
		try {
			displayWelcome.display();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}

public class ReentrantTryLockExample2 {

	public static void main(String[] args) {
		DisplayWelcome2 displayWelcome = new DisplayWelcome2();
		MaThread2 thread1 = new MaThread2("Nasser", displayWelcome);
		MaThread2 thread2 = new MaThread2("John", displayWelcome);
		
		thread1.start();
		thread2.start();
	}
}
