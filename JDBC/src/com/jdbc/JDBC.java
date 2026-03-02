package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root"; 
		String password = "root";
		
		// Step 1: Load Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// Step 2: Establish the connection between Java and Database
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Statement st = null;
		// Step 3: Create the statement
		try {
			st = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ResultSet rs = null;
		// Step 4: Execute Query
		try {
			rs = st.executeQuery("SELECT * FROM STUDENT");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// Step 5: Process the result
		try {
			while(rs.next()) {
				System.out.println(
						rs.getInt(1) + ". " +
						rs.getString(2) + ", " +
						rs.getString(3)
				);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		try {
//			st.executeUpdate(
//					"INSERT INTO Student (id, name, email) VALUES\r\n"
//					+ "(6, 'Akshat Jaiswal', 'priya.sharma@email.com'),\r\n"
//					+ "(7, 'DebKumar Mallick', 'rahul.patel@email.com'),\r\n"
//					+ "(8, 'Priyanshu Raj(OBC)', 'ananya.reddy@email.com'),\r\n"
//					+ "(9, 'Akshay Khanna', 'vikram.singh@email.com'),\r\n"
//					+ "(10, 'Vicky Kaushal', 'meera.gupta@email.com')"
//			);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		try {
			int res1 = st.executeUpdate(
					"INSERT INTO Student (id, name, email) VALUES\r\n"
					+ "(10, 'Akshay Kumar', 'priya.sharma@email.com')\r\n"
			);
			System.out.println("Insert Res: " + res1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			int res = st.executeUpdate("DELETE FROM Student WHERE id = 10");
			System.out.println("Delete Res: " + res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
