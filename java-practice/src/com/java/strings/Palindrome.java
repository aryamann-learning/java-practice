package com.java.strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		String str, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.nextLine();
		for (int i = str.length() - 1; i >= 0; i--)
			reverse += str.charAt(i);
		if (str.equals(reverse))
			System.out.println("Entered string is a palindrome.");
		else
			System.out.println("Entered string is not a palindrome.");
		sc.close();
	}
}
