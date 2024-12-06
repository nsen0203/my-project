package com.java.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Insert {

	public static void main(String[] args) {
		PreparedStatement statement = null;
		Connection connection = null;
		Driver driver = null;
		Scanner scn = new Scanner(System.in);
		try {
			driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_jdbc", "root",
					"asdfghjkl@1234");
			String sql="Insert into Student_1 values(?,?,?)";
			statement=connection.prepareStatement(sql);
			System.out.println("enter id");
			int cid=scn.nextInt();
			System.out.println("enter name");
			String ename=scn.next();
			System.out.println("enter fee");
			int cfee=scn.nextInt();
			statement.setInt(1, cid);
			statement.setString(2, ename);
			statement.setInt(3, cfee);
			int c=statement.executeUpdate();
			if(c>0)
			{
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			
		} catch (Exception e) {

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
