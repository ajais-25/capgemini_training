package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);

//			System.out.println("Enter Student ID");
//			int studentId = sc.nextInt();
			
//			PreparedStatement ps1 = conn.prepareStatement("UPDATE Student SET name = 'Gautam Gambhir' WHERE id = ?");
//			ps1.setInt(1, studentId);
//			System.out.println(ps1.executeUpdate());
			
//			PreparedStatement ps2 = conn.prepareStatement("SELECT * FROM Student WHERE id = ?");
//			ps2.setInt(1, studentId);
//			ResultSet rs = ps2.executeQuery();
//
//			if (rs.next()) {
//				do {
//					System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3));
//				} while (rs.next());
//			} else {
//				System.out.println("ID not present");
//			}
			
			System.out.println("Enter Id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name");
			String name = sc.nextLine();
			System.out.println("Enter Email");
			String email = sc.nextLine();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO Student VALUES (?, ?, ?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			
			System.out.println(ps.executeUpdate());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
