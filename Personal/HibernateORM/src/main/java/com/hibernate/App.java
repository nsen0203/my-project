package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
        System.out.println( "Projected Started.." );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        //Another way of writing above line
        //Configuration cfg=new Configuration();
        //cfg.configure("hibernate.cfg.xml");
        //SessionFactory factory=cfg.buildSessionFactory();
        
        //creating student
        Student st=new Student();
        st.setId(1);
        st.setName("Nikhil");
        st.setCity("Bina");
        System.out.println(st);
        
        //creating address
        Address ad=new Address();
        ad.setStreet(102);
        ad.setCity("Bhopal");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(10.0);
        
        //reading image file
        FileInputStream fs= new FileInputStream("src/main/java/download.png");
        byte[] data=new byte[fs.available()];
        fs.read(data);
        ad.setImage(data);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        System.out.println("Done");
        
    }
}
