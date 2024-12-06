package com.java.javaPractice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert {
	public static void main( String[] args ) {
		Scanner scn=new Scanner(System.in);
		Connection con=null;
        PreparedStatement stmt=null;
        try {
        	Driver driver = new com.mysql.cj.jdbc.Driver();
        	DriverManager.registerDriver(driver);
        	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","asdfghjkl@1234");
        	String sql="insert into college(id,name,fees) values(?,?,?)";
        	stmt=con.prepareStatement(sql);
        	System.out.println("Enter id");
        	int a=scn.nextInt();
        	System.out.println("Enter name");
        	String b=scn.next();
        	System.out.println("Enter fees");
        	int c=scn.nextInt();
        	stmt.setInt(1, a);
        	stmt.setString(2, b);
        	stmt.setInt(3, c);
        	stmt.executeUpdate();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        finally{
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
