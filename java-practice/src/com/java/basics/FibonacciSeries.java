package com.java.basics;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the series of numbers required");
		int n = sc.nextInt();
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for (int i = 2; i<n; i++) {
			int n3 = n1 + n2;
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
		}
		sc.close();
	}

}
