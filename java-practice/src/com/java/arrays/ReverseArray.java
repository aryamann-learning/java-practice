package com.java.arrays;

import java.util.Scanner;

public class ReverseArray {

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
			for (int i = 0; i < arr.length / 2; i++) {
				int temp = arr[i];
				arr[i] = arr[(arr.length - 1) - i];
				arr[(arr.length - 1) - i] = temp;
			}
			System.out.println("After reversing the array:");
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
		}

		sc.close();
	}
}
