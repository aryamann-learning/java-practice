package com.java.collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class PushPop {
	static void push(Stack<Integer> st, int a) {
		st.push(new Integer(a));
		System.out.println("Element " + a + " push to Stack");
		System.out.println("Stack is: " + st);
	}

	static void pop(Stack<Integer> st) {
		Integer a = (Integer) st.pop();
		System.out.println("Element " + a + " pop to the stack");
		System.out.println("Stack is: " + st);
	}

	public static void main(String[] args) {
		try {
			Stack<Integer> stack = new Stack<Integer>();
			System.out.println("Stack: " + stack);
			push(stack, 1);
			push(stack, 2);
			push(stack, 3);
			push(stack, 4);
			pop(stack);
			pop(stack);
			pop(stack);
			pop(stack);
			pop(stack);
		} catch (EmptyStackException ex) {
			System.out.println("Stack is empty");
		}
	}
}