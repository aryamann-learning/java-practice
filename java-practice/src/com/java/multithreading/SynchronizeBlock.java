package com.java.multithreading;

public class SynchronizeBlock {
	public static void main(String[] args) {
		SynchronizeTest obj = new SynchronizeTest();
		MyThread t1 = new MyThread(obj);
		t1.start();
	}
}
