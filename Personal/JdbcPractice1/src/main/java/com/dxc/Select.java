package com.dxc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Select {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.deregisterDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", "root", "Password");
			String sql = "SELECT * FROM BOOKSHOP ";
			stmt = conn.createStatement();
			ResultSet r = stmt.executeQuery(sql);
			while (r.next()) {
				System.out.println(r.getInt("BookId") + " " + r.getString("BookName") + " " + r.getInt("BookPrice"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
