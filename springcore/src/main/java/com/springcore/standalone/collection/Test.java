package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneconfig.xml");
        Employee emp1=(Employee) context.getBean("emp");
        System.out.println(emp1);
        System.out.println(emp1.getFriends().getClass().getName());
        System.out.println(emp1.getFeeStructure());
        System.out.println(emp1.getFeeStructure().getClass().getName());
        System.out.println(emp1.getProperties());
        System.out.println(emp1.getProperties().getClass().getName());
	}

}
