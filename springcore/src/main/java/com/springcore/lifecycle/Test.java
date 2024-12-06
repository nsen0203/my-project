package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
//		A a1=(A) context.getBean("a1");
//		System.out.println(a1);
		context.registerShutdownHook();
		
//		System.out.println("-------------------------------------");
//		B b1=(B)context.getBean("b1");
//		System.out.println(b1);
		
		C c1=(C)context.getBean("c1");
		System.out.println(c1);
		
		
	
		

	}

}
