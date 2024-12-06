package com.list;

import java.util.*;

public class TestLinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ways to add element
//		LinkedList<String> list = new LinkedList<>();
//		list.add("Spring");
//		list.add("Jdbc");
//		list.add("Orm");
//		
//		System.out.println(list);
//		
//		list.add(1,"MVC");
//		
//		System.out.println(list);
//		
//		LinkedList<String> list1 = new LinkedList<>();
//		list1.add("Hibernate");
//		list1.add("Collection");
//		
//		list.addAll(list1);
//		
//		System.out.println(list);
//		
//		list.addAll(1, list1);
//		
//		System.out.println(list);
//		
//		list.addFirst("FirstElement");
//		list.addLast("LastElement");
//		
//		System.out.println(list);
		
		
		//Example to remove elements
		LinkedList<String> list = new LinkedList<>();
		list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ajay");  
        list.add("Anuj");  
        list.add("Gaurav");  
        list.add("Harsh");  
        list.add("Virat");  
        list.add("Gaurav");  
        list.add("Harsh");  
        list.add("Amit");
        
        System.out.println(list);
        
        list.remove(0);
        
        System.out.println(list);
        
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Raman");
        list1.add("Rohan");
        
        System.out.println(list1);
        
//        list.addAll(list1);
//        
//        System.out.println(list);
        
        list.addAll(1, list1);
        
        System.out.println(list);
        
//        list.removeFirst();
//        
//        System.out.println(list);
//        
//        list.removeLast();
//        
//        System.out.println(list);
        
        System.out.println(list);
        
        list.removeAll(list1);
        
        System.out.println(list);
        
        
        list.removeFirstOccurrence("Gaurav");
        
        System.out.println(list);
        
        list.removeLastOccurrence("Harsh");
        
        System.out.println(list);
        
        list.clear();
        
        System.out.println(list);

	}

}
