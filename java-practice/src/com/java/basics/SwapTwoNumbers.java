package com.java.basics;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers a b");
		a=sc.nextInt();
		b=sc.nextInt();
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap "+"a = "+a+" b = "+b);
		sc.close();
	}

}
