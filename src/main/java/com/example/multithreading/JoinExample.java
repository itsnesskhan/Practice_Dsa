package com.example.multithreading;

public class JoinExample extends Thread{
	
	static int count;
	
	


	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			count++;
		}
	}



	
	public static void main(String[] args) throws InterruptedException {
		JoinExample joinExample = new JoinExample();
		joinExample.start();
		joinExample.join(); //main thread calls it,so main in waiting
		System.out.println(count);
		
	}

}
