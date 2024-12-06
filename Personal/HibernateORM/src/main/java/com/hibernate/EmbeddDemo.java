package com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmbeddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Student student1=new Student();
        student1.setId(111);
        student1.setName("Tinku");
        student1.setCity("Bina");
        
        Certificate certificate=new Certificate();
        certificate.setCourse("java");
        certificate.setDuration("6 months");
        
        student1.setCerti(certificate);
        
        
        
        Student student2=new Student();
        student2.setId(112);
        student2.setName("Renu");
        student2.setCity("Bhopal");
        
        Certificate certificate1=new Certificate();
        certificate1.setCourse("hibernate");
        certificate1.setDuration("2 months");
        
        student2.setCerti(certificate1);
        
        
        
        Student student3=new Student();
        student3.setId(113);
        student3.setName("Nikhil");
        student3.setCity("Delhi");
        
        Certificate certificate2=new Certificate();
        certificate2.setCourse("Spring");
        certificate2.setDuration("3 months");
        
        student3.setCerti(certificate2);
        
        
        
        Student student4=new Student();
        student4.setId(114);
        student4.setName("Srashti");
        student4.setCity("Mumbai");
        
        Certificate certificate3=new Certificate();
        certificate3.setCourse("SpringBoot");
        certificate3.setDuration("4 months");
        
        student4.setCerti(certificate3);
        
        
        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        
        //saving objects
        s.save(student1);
        s.save(student2);
        s.save(student3);
        s.save(student4);
        
        tx.commit();
        s.close();
        
        factory.close();

	}

}
