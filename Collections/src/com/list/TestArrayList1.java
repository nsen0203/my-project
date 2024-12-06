package com.list;

import java.util.*;
import com.model.Student;

public class TestArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// For each loop
//		List<String> list = new ArrayList<>();
//		list.add("Spring");
//		list.add("SpringJDBC");
//		list.add("SpringMVC");
//		list.add("Spring");
//		
//		
//		for(String s:list) {
//			System.out.println(s);
//		}

		
		//get and set methods 
//		List<String> list = new ArrayList<>();
//		list.add("Spring");
//		list.add("SpringJDBC");
//		list.add("SpringORM");
//		list.add("Spring");
//		
//		String s = list.get(3);
//		//System.out.println(s);
//		
//		list.set(3, "SpringMVC");
//		
//		for(String s1:list) {
//			System.out.println(s1);
//		}
		
		
		// Collections.sort() code
//		List<String> list = new ArrayList<String>();
//		list.add("Spring");
//		list.add("ApringJDBC");
//		list.add("TpringORM");
//		list.add("QpringMVC");
//		
//		Collections.sort(list);
//	
//		for(String s:list) {
//			System.out.println(s);
//		}
//	
//		System.out.println("----------------------------------");
//		
//		List<Integer> list1 = new ArrayList<>();
//		list1.add(50);
//		list1.add(30);
//		list1.add(60);
//		list1.add(15);
//	
//		Collections.sort(list1);
//		
//		for(Integer i:list1) {
//			System.out.println(i);
//		}
	
		
		//Ways to iterate list
//		List<String> list = new ArrayList<String>();
//		list.add("Spring");
//		list.add("Java");
//		list.add("Hibernate");
//		list.add("MVC");
//		
//		System.out.println("-----Iterate using ListIterator previous method-----");
//		ListIterator<String> itr = list.listIterator(list.size());
//		while(itr.hasPrevious()) {
//			System.out.println(itr.previous());
//		}
//		
//		System.out.println("-----Iterate using ListIterator next method-----");
//		ListIterator<String> it = list.listIterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		
//		System.out.println("------Using For loop-----");
//		
//		for(int i=0; i<=list.size()-1;i++) {
//			System.out.println(list.get(i));
//		}
	
	
		
		
		//user defined object in List
//		List<Student> list = new ArrayList<Student>();
//		list.add(new Student(1, "Java", 10));
//		list.add(new Student(2, "Spring", 20));
//		list.add(new Student(3, "Hibernate", 30));
//		list.add(new Student(4, "Orm", 40));
//		
//		Iterator<Student> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		
		//ArrayList example to add elements
//		List<String> a = new ArrayList<>();
//		a.add("Spring");
//		a.add("Java");
//		a.add("Pyhton");
//		System.out.println("---------------------"+a+"---------------------");
//		a.add(1, "Hibernate");
//		System.out.println("---------------------"+a+"---------------------");
//		
//		List<String> a1 = new ArrayList<>();
//		a1.add("Jdbc");
//		a1.add("ORM");
//		a1.add("learning");
//		
//		a.addAll(a1);
//		System.out.println("---------------------"+a+"---------------------");
//		
//		List<String> a2 = new ArrayList<>();
//		a2.add("OOPS");
//		a2.add("Thread");
//		
//		a.addAll(1, a2);
//		System.out.println("---------------------"+a+"---------------------");
		
		
		//ArrayList example for removing element
//		List<String> list = new ArrayList<>();
//		list.add("Java");
//		list.add("Hibernate");
//		list.add("Spring");
//		
//		System.out.println(list);
//		
//		list.remove(0);
//		
//		System.out.println(list);
//		
//		List<String> list1 = new ArrayList<String>();
//		list1.add("SpringBoot");
//		list1.add("SpringORM");
//		list1.add("SpringJDBC");
//		
//		list.addAll(1,list1);
//		
//		System.out.println(list);
//		
//		list.removeAll(list1);
//		
//		System.out.println(list);
		
		
		//ArrayList example for isEmpty and size
		
		List<String> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		list.add("SQL");
		list.add("JDBC");;
		list.add("ORM");
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		
	
	}

}
