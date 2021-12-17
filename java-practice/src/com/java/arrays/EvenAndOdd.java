package com.java.arrays;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (n != 0) {
			System.out.println("even numbers");
			for (int i = 0; i < n; i++) {
				if (arr[i] % 2 == 0) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
			System.out.println("odd numbers");
			for (int i = 0; i < n; i++) {
				if (arr[i] % 2 != 0) {
					System.out.print(arr[i] + " ");
				}
			}
		}
		sc.close();
	}
}
