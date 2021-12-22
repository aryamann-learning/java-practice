package com.java.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class UsingBufferedReader {
	public static void main(String[] args) {
		try {
			FileReader fin = new FileReader("D:\\ARYA\\practice.txt");
			BufferedReader file = new BufferedReader(fin);
			int i = 0;
			while ((i = file.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
