package com.java.multithreading;

public class MultithreadTwo {
	public static void main(String[] args) {
		int n = 8;
		for (int i = 0; i < n; i++) {
			Thread object = new Thread(new MultithreadingDemo());
			object.start();
		}
	}
}
