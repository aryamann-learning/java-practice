package com.java.exceptions;

import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		int a, b, res;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			res = a / b;
			System.out.println("output =" + res);
		} catch (ArithmeticException e) {
			System.out.println("cannot divided by zero " + e);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("both numbers should be given " + ae);
		} catch (NumberFormatException ne) {
			System.out.println("both must be integers " + ne);
		} finally {
			System.out.println("final block executes");
		}
		sc.close();
	}

}
