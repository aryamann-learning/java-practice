package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadCopy {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fileIn;
		FileOutputStream fileOut;
		try {
			fileIn = new FileInputStream("D:\\ARYA\\practice.txt");
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			return;
		}
		try {
			fileOut = new FileOutputStream("D:\\ARYA\\practiceThree.txt");
		} catch (FileNotFoundException fofe) {
			fofe.printStackTrace();
			return;
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
			return;
		}

		try {
			do {
				i = fileIn.read();
				if (i != -1) {
					fileOut.write(i);
				}
			} while (i != -1);
			System.out.println("Successful");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		fileIn.close();
		fileOut.close();
	}
}