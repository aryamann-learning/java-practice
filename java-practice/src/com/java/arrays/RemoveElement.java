package com.java.arrays;

import java.util.Scanner;

public class RemoveElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Remove elemet");
		int j = sc.nextInt();
		if (n != 0) {
			for (int i = 0; i < n; i++) {
				if (arr[i] == j) {
					continue;
				} else {
					System.out.print(arr[i] + " ");
				}
			}
		}
		sc.close();
	}
}
