package com.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCharWordLine {
	public static void main(String[] args) {
		int lineCount = 0, wordCount = 0, charCount = 0;
		try {
			FileReader file = new FileReader("D:\\ARYA\\practiceTwo.txt");
			BufferedReader reader = new BufferedReader(file);
			String currentLine = reader.readLine();
			while (currentLine != null) {
				lineCount++;
				String[] words = currentLine.split(" ");
				wordCount = wordCount + words.length;

				for (String word : words) {
					charCount = charCount + word.length();
				}
				currentLine = reader.readLine();
			}
			reader.close();
			System.out.println("Number of character in file : " + charCount);
			System.out.println("Number of words in a file : " + wordCount);
			System.out.println("Number of lines in file : " + lineCount);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
