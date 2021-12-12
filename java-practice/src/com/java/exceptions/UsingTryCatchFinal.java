package com.java.exceptions;

import java.util.Scanner;

public class UsingTryCatchFinal {
	public static void main(String[] args) {
		int a, b, c, res;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		try {
			res = a / (b - c);
		} catch (ArithmeticException e) {
			System.out.println("cannot dividd by zero " + e);
		} finally {
			System.out.println("finally block executes");
		}
		res = a / (b + c);
		System.out.println("output =" + res);
		sc.close();
	}

}
