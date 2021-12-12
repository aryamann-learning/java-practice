package com.java.exceptions;

import java.util.Scanner;

public class ChainedExceptions {
	public static void main(String[] args) {
		int a, b, res;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		try {
			res = a / b;
			System.out.println("output =" + res);
		} catch (ArithmeticException e) {
			System.out.println("cannot divided by zero " + e);
		}
		try {
			NumberFormatException ne = new NumberFormatException();
			ne.initCause(new NullPointerException("null pointer Exception"));
			throw ne;
		} catch (NumberFormatException ne) {
			System.out.println("number format " + ne);
		}
	}
}
