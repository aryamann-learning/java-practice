package com.java.multithreading;

public class MultipleThreadTest extends Thread {
	String threadname;
	Thread thread;

	public MultipleThreadTest(String threadname) {
		super();
		this.threadname = threadname;
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Running method =" + threadname);
				Thread.sleep(50);
			}
		} catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
	}

	public void start() {
		System.out.println("Start method " + threadname);
		if (thread == null) {
			thread = new Thread(this, threadname);
			thread.start();
		}
	}
}
