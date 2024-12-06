package com.java.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.Driver;

public class Create 
{
    public static void main( String[] args )
    {
    	PreparedStatement statement=null;
    	Connection connection=null;
    	Driver driver=null;
    	try {
    		driver=new com.mysql.cj.jdbc.Driver();
    		DriverManager.registerDriver(driver);
    		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_jdbc","root","asdfghjkl@1234");
    		String sql="CREATE TABLE Student_1 (CID INT(2) PRIMARY KEY, ENAME VARCHAR(20) NOT NULL, CFEE INT(5))";
    		statement=connection.prepareStatement(sql);
    		statement.executeUpdate();
    	}
    	catch(Exception e){
    		
    		e.printStackTrace();
    	}
    	
    	finally {
    		try {
    			connection.close();
    			statement.close();
    		}
    		catch(Exception e){
        		
        		e.printStackTrace();
        	}
    	}
    }
}
