package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scn=new Scanner(System.in);
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
//        JdbcTemplate template=(JdbcTemplate)context.getBean("jdbcTemplate");
//        String sql="insert into student values(?,?,?)";
//        int result=template.update(sql, 1, "Nikhil", "Bina");
//        System.out.println("Number of records inserted"+ result);
        
        StudentDao studentDao=(StudentDao) context.getBean("studentDao");
        
          // INSERTING STUDENT
//        Student student=new Student();
//        student.setId(3);
//        student.setName("Tinku");
//        student.setCity("Delhi");
//        int result = studentDao.insert(student);
//        System.out.println("Number of records inserted "+ result);
        
          // UPDATING STUDENT
//        Student student=new Student();
//        student.setId(3);
//        student.setName("Nishti");
//        student.setCity("Mumbai");
//        int result=studentDao.update(student);
//        System.out.println("Number of records updated "+ result);
        
        
          //DELETING STUDENT
//        System.out.println("Enter studentId to be deleted");
//        int id=scn.nextInt();
//        int result=studentDao.delete(id);
//        System.out.println("Number of records deleted "+ result);
        
        
          // SELECTING SINGLE STUDENT
//        Student student=studentDao.select(2);
//        System.out.println(student);
        
        
          // SELECTING ALL STUDENTS
        List<Student> students=studentDao.selectAll();
        for(Student s: students) {
        	System.out.println(s);
        }
    }
}
