package com.java.collections;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicates {
	public static void main(String[] args) {

		String str1[] = { "One", "Two", "Three", "Four", "Five", "Six" };
		String str2[] = { "Two", "Four", "Six", "Eight", "Ten" };
		// Using iterator methods to find common elements
		System.out.println("Using iterator methods to find common elements");
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i].equals(str2[j])) {
					hs.add(str1[i]);
				}
			}
		}
		System.out.println(hs);

		System.out.println("Using retailAll() method to find common elements.");
		HashSet<String> set1 = new HashSet<>(Arrays.asList(str1));
		HashSet<String> set2 = new HashSet<>(Arrays.asList(str2));
		set1.retainAll(set2);
		System.out.println(set1);
	}
}
