package com.java.multithreading;

public class MultipleThread {
	public static void main(String args[]) {
		MultipleThreadTest thread1 = new MultipleThreadTest("First Thread");
		thread1.start();

		MultipleThreadTest thread2 = new MultipleThreadTest("Second Thread");
		thread2.start();
	}
}
