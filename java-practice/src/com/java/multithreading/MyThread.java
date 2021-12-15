package com.java.multithreading;

public class MyThread extends Thread {
	SynchronizeTest t;

	public MyThread(SynchronizeTest t) {
		super();
		this.t = t;
	}

	public void run() {
		t.printNumber(7);
	}
}