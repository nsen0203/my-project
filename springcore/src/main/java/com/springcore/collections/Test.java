package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
        Emp emp1=(Emp) context.getBean("emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhone());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getPhone().getClass().getName());
        
    }
}