package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	
	public static void main(String[]args) {
		
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        //creating question
        Question q1=new Question();
        q1.setQuestionId(1);
        q1.setQuestion("What is Java?");
        
        //creating answer
        Answer answer=new Answer();
        answer.setAnswerId(111);
        answer.setAnswer("Java is programming language");
        answer.setQuestion(q1);//using bidirectional
        q1.setAnswer(answer);
        
        //creating question
        Question q2=new Question();
        q2.setQuestionId(2);
        q2.setQuestion("What is Collection Framework?");
        
        //creating answer
        Answer answer1=new Answer();
        answer1.setAnswerId(112);
        answer1.setAnswer("API to work with objects in Java");
        answer.setQuestion(q2);//using bidirectional
        q2.setAnswer(answer1);
        
        //Session open
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        
        //save
        s.save(q1);
        s.save(q2);
        s.save(answer);
        s.save(answer1);
        
        tx.commit();
        s.close();
        factory.close();
	}

}
