package com.java.io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileWriting {
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream file = new FileOutputStream("D:\\ARYA\\practiceThree.txt");
			OutputStreamWriter writer = new OutputStreamWriter(file);
			BufferedWriter writing = new BufferedWriter(writer);
			writing.write("I am using Buffered Writer to write");
			System.out.println("Sucessfully written");
			writing.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
