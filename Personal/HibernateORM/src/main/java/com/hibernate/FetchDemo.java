package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// get, load
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        
        //get or load student data
//        Student student=(Student)session.get(Student.class, 1);
//        //Student student=(Student)session.load(Student.class, 1);
//        System.out.println(student);
//        
//        //get or load address data
//        Address address=(Address)session.get(Address.class, 2);
//        System.out.println(address.getCity());
//        
//        Address address1=(Address)session.get(Address.class, 2);
//        System.out.println(address1.getCity());
        
        Student student=(Student)session.load(Student.class, 1);
        Student student1=(Student)session.load(Student.class, 1);
        System.out.println(student.getName());
          factory.close();

	}

}
