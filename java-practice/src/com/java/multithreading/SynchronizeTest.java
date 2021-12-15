package com.java.multithreading;

public class SynchronizeTest {
	void printNumber(int n) {
		synchronized (this) {
			System.out.println("Table of " + n);
			System.out.println();
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + " * " + i + " = " + (n * i));
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
