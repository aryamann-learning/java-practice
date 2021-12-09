package com.java.basics;

import java.util.Scanner;

public class RandomGuess {
	public static void main(String[] args) {
		int answer, guess;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the guess number between 1-50");
		answer = 20;
		do {
			System.out.print("Guess what the number is: ");
			guess = sc.nextInt();
			if (guess > answer)
				System.out.println("Incorrect guess!!");
			else if (guess < answer)
				System.out.println("Incorrect guess!!");
			else
				System.out.println("Correct guess!!\n\n\n");
		} while (guess != answer);

		sc.close();
	}

}
