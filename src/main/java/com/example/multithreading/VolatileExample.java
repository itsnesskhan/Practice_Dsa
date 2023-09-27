package com.example.multithreading;

public class VolatileExample {
    private volatile boolean stopFlag = false; // Declare a volatile variable

    // Method to set the stopFlag to true
    public void stop() {
        stopFlag = true;
    }

    // Method to check the value of stopFlag
    public boolean isStopped() {
        return stopFlag;
    }

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();

        // Thread 1: Continuously checks the stopFlag value
        Thread thread1 = new Thread(() -> {
            while (!example.isStopped()) {
                // Do some work
                System.out.println("Thread 1: Working...");
            }
            System.out.println("Thread 1: Detected stopFlag set to true. Exiting.");
        });

        // Thread 2: Sets the stopFlag to true after a delay
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: Setting stopFlag to true.");
            example.stop(); // Set stopFlag to true
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
