package com.dxc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Create {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", "root", "Password");
			String sql = "CREATE TABLE DXCCOMPANY(COLLEGEID INT(9) PRIMARY KEY, COLLEGENAME VARCHAR (20) NOT NULL)";
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
