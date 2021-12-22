package com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteFile {
	public static void main(String[] args) {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("practice.txt"));
			bufferedWriter.write("Welcome");
			bufferedWriter.close();
			boolean status = (new File("practice.txt")).delete();
			if (status) {
				System.out.println("File deleted successfully");
			}
			BufferedReader bufferedReader = new BufferedReader(new FileReader("practice.txt"));
			String str;
			while ((str = bufferedReader.readLine()) != null) {
				System.out.println(str);
			}
			bufferedReader.close();
		} catch (IOException ioe) {
			System.out.println("File not found");
			ioe.printStackTrace();
		}
	}
}
