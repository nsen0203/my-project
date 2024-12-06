package com.dxc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class delete {

	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", "root", "Password");
			String sql = "DELETE FROM BOOKSHOP WHERE BOOKID=? ";
			stmt = conn.prepareStatement(sql);
			System.out.println("enter bookid");
			int a = scn.nextInt();
			stmt.setInt(1, a);
			int n = stmt.executeUpdate();
			if (n > 0) {
				System.out.println("deleted");
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
