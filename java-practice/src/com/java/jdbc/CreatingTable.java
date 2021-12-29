package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreatingTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
			java.sql.Statement stmt = con.createStatement();
			stmt.executeUpdate("CREATE TABLE Arya " + "(id INTEGER not NULL, " + " first VARCHAR(255), "
					+ " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))");
			System.out.println("Table is created .......");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
