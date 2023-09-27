package com.example.multithreading;

import java.util.concurrent.locks.ReentrantLock;

class DisplayWelcome{
	
	ReentrantLock reentrantLock = new ReentrantLock();
	
	public void display() {
		reentrantLock.lock(); //same syncoronization effect we can achive with reentracntlok
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Welcome : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
		
		reentrantLock.unlock();
	}
}

class MaThread extends Thread{
	
	private DisplayWelcome displayWelcome;
	
	public MaThread(String name, DisplayWelcome displayWelcome) {
		super(name);
		this.displayWelcome = displayWelcome;
	}



	@Override
	public void run() {
		displayWelcome.display();
	}
	
	
}

public class ReentrantLockExample {

	public static void main(String[] args) {
		DisplayWelcome displayWelcome = new DisplayWelcome();
		MaThread thread1 = new MaThread("Nasser", displayWelcome);
		MaThread thread2 = new MaThread("John", displayWelcome);
		
		thread1.start();
		thread2.start();
	}
}
