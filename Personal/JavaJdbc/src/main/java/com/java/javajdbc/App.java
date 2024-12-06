package com.java.javajdbc;

import java.util.List;
import java.util.Scanner;

import com.java.dao.StudentDao;
import com.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
        StudentDao studentDao=new StudentDao();
        Student student=new Student();
        
        Scanner scn=new Scanner(System.in);
        int choice=0;
        
        while(true) {
        	System.out.println("1) Add Student");
        	System.out.println("2) Display Students");
        	System.out.println("3) Delete Student");
        	System.out.println("6) Exit");
        	System.out.println("Enter your choice");
            choice = scn.nextInt();
        	switch(choice) {
        	case 1: System.out.println("Enter roll no.");
        	        int roll = scn.nextInt();
        	        System.out.println("Enter name ");
        	        String name = scn.next();
        	        System.out.println("Enter marks.");
        	        int marks = scn.nextInt();
        	        student.setRoll(roll);
        	        student.setName(name);
        	        student.setMarks(marks);
        	        studentDao.addStudent(student);
        	        break;
        	case 2: System.out.println("The students are:");
        	        List<Student> stdList=studentDao.displayStudent();
        	        for(Student student1:stdList) {
        	        	System.out.println(student1.getRoll()+ student1.getName()+ student1.getMarks());
        	        }
        	        break;
        	case 3: System.out.println("Enter roll to delete");
        	        int roll1=scn.nextInt();
        	        studentDao.deleteStudent(roll1);
        	        break;
        	case 4: System.out.println("Enter roll no to update");
        	        int roll2=scn.nextInt();
        	        studentDao.updateStudent(roll2);
        	        break;
        	}
        }
    }
}
