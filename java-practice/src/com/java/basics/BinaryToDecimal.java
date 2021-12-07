package com.java.basics;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int decimal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number");
		int n = sc.nextInt();
		int power = 0;

		while (true) {
			if (n == 0) {
				break;
			} else {
				int temp = n % 10;
				decimal += temp * Math.pow(2, power);
				n = n / 10;
				power++;
			}
		}
		System.out.println("Decimal number =" + decimal);
		sc.close();
	}
}
