package com.java.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReaderWriter {
	public static void main(String[] args) {
		String text;

		try {

			FileReader fileReader = new FileReader("D:\\ARYA\\practice.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((text = bufferedReader.readLine()) != null) {
				System.out.println(text);
			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
