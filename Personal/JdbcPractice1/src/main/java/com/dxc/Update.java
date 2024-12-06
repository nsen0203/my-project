package com.dxc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Update {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", "root", "Password");
			String sql = " UPDATE BOOKSHOP SET BOOKPRICE= ? WHERE BOOKID=? ";
			stmt = conn.prepareStatement(sql);
			System.out.println("enter bookid");
			int a = scn.nextInt();
			System.out.println("enter bookprice");
			int b = scn.nextInt();
			stmt.setInt(1, b);
			stmt.setInt(2, a);
			int n = stmt.executeUpdate();
			if (n > 0) {
				System.out.println("updated");
			} else {
				System.out.println("no");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
