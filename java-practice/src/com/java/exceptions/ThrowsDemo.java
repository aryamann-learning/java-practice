package com.java.exceptions;

public class ThrowsDemo {
	public static void add() throws NullPointerException {
		System.out.println("Nullpointer Exception");
		throw new NullPointerException("In method add");
	}

	public static void divide() throws ArithmeticException {
		System.out.println("Arithmetaic Exception");
		throw new ArithmeticException("In method divide");
	}

	public static void main(String[] args) {
		try {
			add();
		} catch (NullPointerException ne) {
			System.out.println("exception is " + ne);
		}
		try {
			divide();
		} catch (ArithmeticException ae) {
			System.out.println("exception is " + ae);
		}
	}
}
