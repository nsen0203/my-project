package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.Dao.StudentDao;
import com.spring.orm.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao=(StudentDao) context.getBean("studentDao");
        
//        Student student=new Student(1,"Nishti","Bhopal");
//        int r=studentDao.insert(student);
//        System.out.println("Inserted "+ r);
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean go=true;
        while(go) {
        	System.out.println("PRESS 1 to add new student");
            System.out.println("PRESS 2 to display all students");
            System.out.println("PRESS 3 to display single student");
            System.out.println("PRESS 4 to delete student");
            System.out.println("PRESS 5 to update student");
            System.out.println("PRESS 6 to exit");
            
            try {
            	
            	int choice = Integer.parseInt(br.readLine());
            	
            	switch(choice) {
            	
            	case 1:
            		// add student
            		//taking inputs from user
            		System.out.println("Enter userId: ");
            		int uId = Integer.parseInt(br.readLine());
            		System.out.println("Enter username: ");
            		String uName = br.readLine();
            		System.out.println("Enter user city: ");
            		String uCity = br.readLine();
            		
            		//creating student object and setting values
            		Student s=new Student();
            		s.setId(uId);
            		s.setName(uName);
            		s.setCity(uCity);
            		
            		//saving student object to database by calling insert method
            		int result = studentDao.insert(s);
            		System.out.println(result + " Student added ");
            		System.out.println("-------------------------");
            		System.out.println();
            		break;
            	
            	case 2:
            		//display student
            		System.out.println("*********************************");
            		List<Student> allStudent = studentDao.getAllStudent();
            		for(Student std: allStudent) {
            			System.out.println("Name: " + std.getName());
            			System.out.println("Id: "+ std.getId());
            			System.out.println("City: "+ std.getCity());
            			System.out.println("-------------------------");
            		}
            		System.out.println("**********************************");
            		break;
            		
            	case 3:
            		//display single student
            		System.out.println("Enter userId: ");
            		int userId = Integer.parseInt(br.readLine());
            		Student student = studentDao.getStudent(userId);
            		System.out.println("Name: " + student.getName());
        			System.out.println("Id: "+ student.getId());
        			System.out.println("City: "+ student.getCity());
            		break;
            		
            	case 4:
            		//update student
            		System.out.println("Enter userId: ");
            		int id = Integer.parseInt(br.readLine());
            		studentDao.deleteStudent(id);
            		System.out.println("Student deleted");
            		break;
            		
            	case 5:
            		//delete student;
            		System.out.println("Enter userId: ");
            		int userid = Integer.parseInt(br.readLine());
            		System.out.println("Enter username: ");
            		String userName = br.readLine();
            		System.out.println("Enter user city: ");
            		String userCity = br.readLine();
            		
            		Student st=new Student();
            		st.setId(userid);
            		st.setName(userName);
            		st.setCity(userCity);
            		
            	    studentDao.updateStudent(st);
            	    System.out.println("Student updated");
            		
            		break;
            		
            	case 6:
            		go = false;
            		break;
            	
            	}
            	
            }
            catch(Exception e) {
            	System.out.println("Invalid Input");
            	System.out.println(e.getMessage());
            }
        }
        
        System.out.println("Thank you for using application");
        
    }
}
