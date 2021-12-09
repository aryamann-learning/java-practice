package com.java.oops;

public class OverLoadInterface implements AddOdd {
	public void add() {
		System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
	}

	public void sub() {
		System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
	}

	public static void main(String[] args) {
		OverLoadInterface obj = new OverLoadInterface();
		obj.add();
		obj.sub();
	}
}
