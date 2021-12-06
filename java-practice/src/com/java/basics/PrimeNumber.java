package com.java.basics;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		if (n == 1 && n == 2) {
			System.out.println("Given number is prime");
		}
		for (int i = 2; i <= n / 2; i++) {
			int temp = n % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Given number is prime");
		} else {
			System.out.println("Given number is not prime");
		}
		sc.close();
	}

}
