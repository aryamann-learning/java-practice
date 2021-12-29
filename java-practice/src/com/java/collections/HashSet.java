package com.java.collections;

public class HashSet {

	public static void main(String[] args) {
		java.util.HashSet<String> hs = new java.util.HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		System.out.println("HashSet elements: ");
		System.out.println(hs);

		String[] arr = new String[hs.size()];
		hs.toArray(arr);
		System.out.println();
		System.out.println("\nHashSet elements are copied into Array: ");

		for (String str : arr) {
			System.out.println(str);
		}
	}
}
