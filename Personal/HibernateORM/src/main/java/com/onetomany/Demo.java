package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
//      //creating question
//        Ques q1=new Ques();
//        q1.setQuesId(1);
//        q1.setQues("What is Java?");
//        
//       
//      //creating answer
//        Ans ans=new Ans();
//        ans.setAnsId(111);
//        ans.setAns("Java is programming language");
//        ans.setQues(q1);
//        
//        
//      //creating answer
//        Ans ans1=new Ans();
//        ans1.setAnsId(222);
//        ans1.setAns("Java is a object oriented programming language");
//        ans1.setQues(q1);
//        
//        
//      //creating answer
//        Ans ans2=new Ans();
//        ans2.setAnsId(333);
//        ans2.setAns("Java have collection framework");
//        ans2.setQues(q1);
//        
//        List<Ans> list=new ArrayList<Ans>();
//        list.add(ans);
//        list.add(ans1);
//        list.add(ans2);
//        
//        q1.setAns(list);
//        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        
//        s.save(q1);
//        s.save(ans);
//        s.save(ans1);
//        s.save(ans2);
        Ques q=(Ques)s.get(Ques.class, 1);
        
          //fetching data
//        System.out.println(q.getQues());
//        
//        for(Ans a:q.getAns()) {
//        	System.out.println(a.getAns());
//        }
        
        //Loading lazy or eager
        System.out.println(q.getQuesId());
        System.out.println(q.getQues());
 
        System.out.println(q.getAns().size());
        
        tx.commit();
        s.close();
        factory.close();
        

	}

}
