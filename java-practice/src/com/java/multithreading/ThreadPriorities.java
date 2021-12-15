package com.java.multithreading;

public class ThreadPriorities extends Thread {
	public void run() {
		String threadName = Thread.currentThread().getName();
		int threadPrior = Thread.currentThread().getPriority();
		System.out.println("Thread Name = " + threadName + "   " + "Thread Priority = " + threadPrior);
	}

	public static void main(String[] args) throws Exception {
		ThreadPriorities t1 = new ThreadPriorities();
		ThreadPriorities t2 = new ThreadPriorities();
		ThreadPriorities t3 = new ThreadPriorities();

		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
	}

}
