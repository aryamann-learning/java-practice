package com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class InsertDisplay {
	public static void main(String[] args) {
		String text;

		try {
			FileOutputStream file = new FileOutputStream("D:\\ARYA\\practiceThree.txt");
			OutputStreamWriter writer = new OutputStreamWriter(file);
			BufferedWriter writing = new BufferedWriter(writer);
			writing.write("I am using Buffered Writer to write");
			System.out.println("Successfully written");
			writing.close();
			FileReader fileReader = new FileReader("D:\\ARYA\\practiceThree.txt");
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
