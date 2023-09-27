package com.example.multithreading;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Product {
	int element = 0;
	private boolean producerChance = true;
	
	public synchronized void produce() throws InterruptedException {
		if (!producerChance) {
			wait();
		}
		if (element == 0) {
			this.setElement(1);
			System.out.println(Thread.currentThread().getName()+" produced "+element);
			Thread.sleep(1000);
			producerChance = false;
			notify();
		}
	}
	
	public synchronized void consume() throws InterruptedException {
		if (producerChance) {
			wait();
		}
		if (element==1) {
			this.setElement(0);
			System.out.println(Thread.currentThread().getName()+" consumed "+element);
			Thread.sleep(1000);
			this.producerChance = true;
			notify();
		}
	}
}

@AllArgsConstructor
class Producer implements Runnable {

	private Product product;

	

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				product.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}

@AllArgsConstructor
class Consumer implements Runnable {

	private Product product;
	
	
	

	@Override public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				product.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ProducerConsumerExample {

	public static void main(String[] args) {
		Product product = new Product();
		Producer producer = new Producer(product);
		Consumer consumer = new Consumer(product);
		
		Thread thread = new Thread(producer);
		thread.setName("Producer");
		Thread thread2 = new Thread(consumer);
		thread2.setName("Consumer");
		
		thread.start();
		thread2.start();
	}
}
