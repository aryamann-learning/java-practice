package com.java.basics;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int originalNumber = n;
		while (n != 0) {
			int rem = n % 10;
			result = result * 10 + rem;
			n /= 10;
		}
		if (result == originalNumber) {
			System.out.println("Given number is palindrom");
		} else {
			System.out.println("Given number is not a palindrome");
		}
		sc.close();
	}

}
