package com.java.exceptions;

public class CustomDemoException {
	public void display() throws Exception {
		for (int i = 1; i < 10; i++) {
			System.out.println("i= " + i);
			if (i == 5) {
				throw new Exception("My Exception Occurred");
			}
		}
	}

	public static void main(String[] args) throws Exception {

		CustomDemoException custom = new CustomDemoException();
		custom.display();
	}
}
