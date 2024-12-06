package com.java.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Delete {

	public static void main(String[] args) {
		PreparedStatement statement=null;
		Connection connection=null;
		Driver driver=null;
		Scanner scn=new Scanner(System.in);
		try {
			driver=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_jdbc", "root", "asdfghjkl@1234");
			String sql="Delete from Student_1 where cid=?";
			statement=connection.prepareStatement(sql);
			System.out.println("Enter cid");
			int cid=scn.nextInt();
			statement.setInt(1, cid);
			int i=statement.executeUpdate();
			if(i>0) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			
			
		}
		catch (Exception e) {

			e.printStackTrace();
		}
		finally {
			try {
				statement.close();
				connection.close();
			}
			catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

}
