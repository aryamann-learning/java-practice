package com.java.strings;

import java.util.Scanner;

public class UpperAndLowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine().toString();
		if (str == null) {
			System.out.println("No String");
		} else if (str.contentEquals(str.toLowerCase())) {
			System.out.println(str.toUpperCase());
		} else if (str.contentEquals(str.toUpperCase())) {
			System.out.println(str.toLowerCase());
		}
		sc.close();
	}
}
