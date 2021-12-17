package com.java.arrays;

import java.util.Scanner;

public class Duplicates {
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
			System.out.println("Duplicates are :");
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] == arr[j]) {
						System.out.print(arr[i] + " ");
					}
				}
			}
		}
		sc.close();
	}
}
