package com.java.basics;

import java.util.Scanner;

public class EvenOddAndZeros {
	public static void main(String[] args) {
		int evenCount = 0, oddCount = 0, ZerosCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		while (n > 0) {
			if (n % 10 == 0) {
				ZerosCount++;
			} else if (n % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			n = n / 10;
		}
		System.out.println(
				"even Count =" + evenCount + " " + "odd count =" + oddCount + " " + "zeros count =" + ZerosCount);
		sc.close();
	}

}
