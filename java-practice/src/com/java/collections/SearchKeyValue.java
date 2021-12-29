package com.java.collections;

import java.util.Hashtable;
import java.util.Scanner;

public class SearchKeyValue {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "First");
		ht.put(2, "Second");
		ht.put(3, "Third");
		ht.put(4, "Forth");
		ht.put(5, "Fifth");
		System.out.println("Hashtable elements with key: ");
		System.out.println(ht);
		System.out.println("Search value of key :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (ht.containsKey(a)) {
			System.out.println(ht.get(a));
		}
		sc.close();

	}
}
