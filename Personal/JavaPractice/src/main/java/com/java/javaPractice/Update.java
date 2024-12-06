package com.java.javaPractice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			Driver driver=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","asdfghjkl@1234");
			String sql="update college set fees=? where id=?";
			System.out.println("Enter id");
			int a=scn.nextInt();
			System.out.println("Enter fees");
			int b=scn.nextInt();
			stmt.setInt(1, b);
			stmt.setInt(2, a);
			stmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
