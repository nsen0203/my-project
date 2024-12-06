package com.java.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Display {

	public static void main(String[] args) {
		Statement statement=null;
		Connection connection=null;
		Driver driver=null;
		try {
			driver=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_jdbc", "root",
					"asdfghjkl@1234");
			String sql="Select*from Student_1";
			statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("cid")+" "+resultSet.getString("ename")+" "+resultSet.getInt("cfee"));
			}
			
		}
		catch (Exception e) {

			e.printStackTrace();
		}

		finally {
			try {
				connection.close();
				statement.close();
			}
			catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

}
