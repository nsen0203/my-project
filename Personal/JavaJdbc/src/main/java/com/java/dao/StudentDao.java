package com.java.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.entity.Student;

public class StudentDao {
	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet result;
	
    public StudentDao(){
    	try {
    		Driver driver=new com.mysql.cj.jdbc.Driver();
    		DriverManager.registerDriver(driver);
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","asdfghjkl@1234");
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		String sql="insert into student values(?,?,?)";
		try {
    		stmt=con.prepareStatement(sql);
    		stmt.setInt(1,student.getRoll());
    		stmt.setString(2, student.getName());
    		stmt.setInt(3, student.getMarks());
    		stmt.executeUpdate();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
		
	}

	public List<Student> displayStudent() {
		// TODO Auto-generated method stub
		List<Student> studentList=new ArrayList();
		String sql="select roll,name,marks from student";
		try {
			stmt=con.prepareStatement(sql);
			result=stmt.executeQuery();
			while(result.next()) {
				Student student=new Student();
				student.setRoll(result.getInt("roll"));
				student.setName(result.getString("name"));
				student.setMarks(result.getInt("marks"));
				studentList.add(student);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}

	public void deleteStudent(int roll1) {
		// TODO Auto-generated method stub
		String sql="delete from student where roll=?";
		try {
			stmt=con.prepareStatement(sql);
			stmt.setInt(1, roll1);
			stmt.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public void updateStudent(int roll2) {
		// TODO Auto-generated method stub
		
	}

}
