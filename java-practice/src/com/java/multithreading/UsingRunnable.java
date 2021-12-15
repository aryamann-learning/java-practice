package com.java.multithreading;

public class UsingRunnable implements Runnable {
	String message;

	public UsingRunnable(String msg) {
		message = msg;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Running method = " + message);
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println("Exception caught" + e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		UsingRunnable obj1 = new UsingRunnable("method one");
		UsingRunnable obj2 = new UsingRunnable("method two");
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}
