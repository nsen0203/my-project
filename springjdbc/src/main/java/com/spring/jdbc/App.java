package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/jdbcconfig.xml");
		
		StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
		
		Student student=new Student();
		
//		INSERTING DATA
//		student.setId(14);
//		student.setName("Nikhil");
//		student.setCity("Delhi");
//		studentDao.insert(student);
		
		
//		UPDATING DATA
//		student.setId(14);
//		student.setName("Nick");
//		student.setCity("Raipur");
//		studentDao.update(student);
		
		
//		DELETING DATA
		studentDao.delete(11);
		
		
    }
}
