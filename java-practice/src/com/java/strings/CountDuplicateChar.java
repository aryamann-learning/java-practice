package com.java.strings;

import java.util.Scanner;

public class CountDuplicateChar {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine().toString();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
		}
		if (count > 0) {
			System.out.println("Total Duplicates present in given string : " + count);
		} else
			System.out.println("no Duplicates present in given string.");
		sc.close();
	}
}
