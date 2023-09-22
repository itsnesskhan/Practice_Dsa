package com.example.multithreading;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Product {
	int element = 0;
	private boolean producerChance = false;
}

@AllArgsConstructor
class Producer implements Runnable {

	private Product product;

	public void produce() throws InterruptedException {
		int count=0;
		if (!product.isProducerChance()) {
			wait();
		}
		if (product.getElement() == 0) {
			product.setElement(1);
			count++;
			System.out.println(Thread.currentThread().getName()+" produced "+count);
			Thread.sleep(100);
			product.setProducerChance(true);
			notify();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}

@AllArgsConstructor
class Consumer implements Runnable {

	private Product product;
	
	
	public void consume() throws InterruptedException {
		int count=0;
		if (product.isProducerChance()) {
			wait();
		}
		if (product.getElement()==1) {
			product.setElement(0);
			count++;
			System.out.println(Thread.currentThread().getName()+" consumed "+count);
			Thread.sleep(100);
			product.setProducerChance(false);
			notify();
		}
	}

	@Override public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				consume();
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
