package com.dxc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Insert {

	public static void main(String[] arg) {
		Connection conn = null;
		Scanner scn = new Scanner(System.in);
		PreparedStatement stmt = null;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", "root", "Password");
			String sql = "INSERT INTO BOOKSHOP(BOOKID,BOOKNAME,BOOKPRICE) VALUES(?,?,?)";
			stmt = conn.prepareStatement(sql);
			System.out.println("enter a bookid");
			int a = scn.nextInt();
			System.out.println("enter a bookname");
			String b = scn.next();
			System.out.println("enter a bookprice");
			int c = scn.nextInt();
			stmt.setInt(1, a);
			stmt.setString(2, b);
			stmt.setInt(3, c);
			int d = stmt.executeUpdate();
			if (d > 0) {
				System.out.println("inserted");
			} else {
				System.out.println("not");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
