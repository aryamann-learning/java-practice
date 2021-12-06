package com.java.basics;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		int i, j, space = 0, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row = sc.nextInt();
		for (i = 0; i < row; i++) {
			for (space = row; i < space; space--) {
				System.out.print(" ");
			}
			num = 1;
			for (j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num * (i - j) / (j + 1);
			}
			System.out.println("\n");
		}
		sc.close();
	}
}
