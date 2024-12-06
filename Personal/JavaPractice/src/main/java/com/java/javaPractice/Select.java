package com.java.javaPractice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;

		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","asdfghjkl@1234");
			String sql="select*from college";
			stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(sql);
			while(result.next()) {
				System.out.println(result.getInt("id")+" "+result.getNString("name")+" "+result.getInt("fees"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				stmt.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
