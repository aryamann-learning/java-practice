package com.java.collections;

import java.util.ArrayList;

public class AddRetriveRemove {
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("Anji");
		str.add("Arya");
		str.add("Priyanka");

		str.retainAll(str);
		System.out.println(str);

		str.remove(1);
		str.retainAll(str);
		System.out.println(str);
	}
}
