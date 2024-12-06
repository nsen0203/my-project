package com.java.javaPractice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			Driver driver=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","asdfghjkl@1234");
			String sql="delete from college where id =?";
			stmt=con.prepareStatement(sql);
			System.out.println("Enter ID");
			int a=scn.nextInt();
			stmt.setInt(1, a);
			stmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
