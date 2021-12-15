package com.java.multithreading;

public class RunningThread extends Thread {
	public static void main(String[] args) {
		RunningThread obj = new RunningThread();
		obj.setName("Thread one");
		obj.start();

		ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
		int numThreads = currentGroup.activeCount();
		Thread[] allThreads = new Thread[numThreads];
		currentGroup.enumerate(allThreads);
		for (int i = 0; i < numThreads; i++) {
			System.out.println("Number of thread: " + i + "  " + allThreads[i].getName());
		}
		Thread currentThread = Thread.currentThread();
		System.out.println("Current Thread Running " + currentThread);
	}

}
