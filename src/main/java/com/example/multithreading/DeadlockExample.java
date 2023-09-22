package com.example.multithreading;


class As {
	
	public synchronized void d1(Bs b) {
		String threadName = Thread.currentThread().getName();
		
		System.out.println(threadName+" start executing d1 method");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(threadName+ " trying to call B's last method");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("A's last method");
	}
}

class Bs {
	
	public synchronized void d2(As a) {
		String threadName = Thread.currentThread().getName();
		
		System.out.println(threadName+" start executing d2 method");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(threadName+ " trying to call A's last method");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("B's last method");
	}
}

class DeadLock extends Thread{
	
	As a = new As();
	Bs b = new Bs();
	
	public void m1() {
		this.start(); // child thread starts
		a.d1(b);  // main thread calling d1 method
	}

	@Override
	public void run() {
		b.d2(a); // child thread calling d2 method
	}
	
	
}

public class DeadlockExample {

	public static void main(String[] args) {
		DeadLock deadLock = new DeadLock();
		deadLock.setPriority(5);
		deadLock.setName("child Thread");
		deadLock.m1();
	}
}
