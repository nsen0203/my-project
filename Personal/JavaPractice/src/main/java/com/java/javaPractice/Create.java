package com.java.javaPractice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class Create 
{
    public static void main( String[] args )
    {
        Connection con=null;
        Statement stmt=null;
        try {
        	Driver driver = new com.mysql.cj.jdbc.Driver();
        	DriverManager.registerDriver(driver);
        	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","asdfghjkl@1234");
        	String sql="create table college(id int, name varchar(255), fees int)";
        	stmt=con.createStatement();  
        	stmt.executeUpdate(sql);
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
