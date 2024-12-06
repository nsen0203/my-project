package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

public class HQLExample {
	
	public static void main(String[]args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		//HQL Syntax
		//String query="from Student where city='Bina'";
		
		//using projection by using dynamical values
		//String query="from Student where city=:x";
		
		//using alias name
//		String query="from Student as s where s.city=:x and s.name=:n";
//		
//		Query q=s.createQuery(query);
//		q.setParameter("x", "Bina");
//		q.setParameter("n", "Tinku");
//		
//		//multiple data
//		List<Student> list=q.list();
//		
//		for(Student std:list) {
//			System.out.println(std.getName()+" : "+std.getCerti().getCourse());
//		}
		
		
		//deleting the data
//		System.out.println("---------------------------------------");
//		Query q1=s.createQuery("delete from Student where city=:c");
//		q1.setParameter("c", "Bina");
//		int r=q1.executeUpdate();
//		System.out.println("Deleted");
//		System.out.println(r);
		
		
		//updating the data
		System.out.println("---------------------------------------");
		Query q=s.createQuery("update Student set city=:c where name=:n");
		q.setParameter("c", "Bina");
		q.setParameter("n", "Nikhil");
		int r=q.executeUpdate();
		System.out.println(r+"objects updated");
		
		
		tx.commit();
		s.close();
		factory.close();
		
	}

}
