package com.java.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class UsingTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(21);
		set.add(11);
		set.add(14);
		set.add(15);
		set.add(23);
		set.add(24);
		Iterator<Integer> iterator = set.iterator();

		System.out.println("The elements of TreeSet");

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		if (set.isEmpty()) {
			System.out.println("\nTreeSet is empty.");
		} else
			System.out.println("\nSize of the TreeSet: " + set.size());

		System.out.println("\nFirst element of TreeSet: " + set.first());
		System.out.println("Last element of TreeSet: " + set.last());

		if (set.remove(23)) {
			System.out.println("\nData 23 is deleted: ");
		} else {
			System.out.println("\nData is not present in TreeSet");
		}
		iterator = set.iterator();
		System.out.println("\nNow the elements of TreeSet");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println("\nSize of the TreeSet: " + set.size());

		set.clear();
		if (set.isEmpty()) {
			System.out.println("\nTreeSet is Empty.");
		} else
			System.out.println("Size of the TreeSet: " + set.size());
	}
}
