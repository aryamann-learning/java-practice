package com.java.basics;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		while (n != 0) {
			int res = n % 10;
			reverse = reverse * 10 + res;
			n = n / 10;
		}
		System.out.println("Reverse of the number=" + reverse);
		sc.close();
	}
}
