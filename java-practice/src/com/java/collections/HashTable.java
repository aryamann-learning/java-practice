package com.java.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("1", "Anji");
		hashtable.put("2", "Priyanka");
		hashtable.put("3", "Arya");
		hashtable.put("4", "Raj");
		hashtable.put("5", "Surya");
		System.out.println("Size of Hashtable: " + hashtable.size());
		System.out.println("Hashtable in empty: " + hashtable.isEmpty());
		System.out.println("Elements of the Hashtable:");
		Enumeration<String> value = hashtable.elements();
		while (value.hasMoreElements()) {
			System.out.println(value.nextElement());
		}
	}
}
