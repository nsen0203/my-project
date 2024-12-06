package com.collection.java8;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list= new ArrayList<>();
		list.addAll(Arrays.asList(
					new Employee(101, "Rahul"),
					new Employee(102, "Abhi"),
					new Employee(103, "Yaman"),
					new Employee(104, "Nikhil"),
					new Employee(105, "Tinku")
				));
		
		System.out.println(list);
		
		
		
		//Using Anonymous class concept
//		Comparator<Employee> comp = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee emp1, Employee emp2) {
//				// TODO Auto-generated method stub
//				return emp1.getEmpName().compareTo(emp2.getEmpName());
//			}
//			
//		};
//		
//		Collections.sort(list, comp);
//		
//		System.out.println(list);
		
		
		//Using lambda expression
		//First way
		
//		Collections.sort(list, new Comparator<Employee>() {
//			
//			public int compare(Employee e1, Employee e2) {
//				return e1.getEmpName().compareTo(e2.getEmpName());
//			}
//			
//		});
//		
//		System.out.println(list);
		
		
		
		//Using lambda expression
		//Second way
		
//		Collections.sort(list, (Employee e1, Employee e2) -> e1.getEmpName().compareTo(e2.getEmpName()) );
//		
//		System.out.println(list);
		
		
		
		//Using method reference(Class Name :: method Name)
		Collections.sort(list, Comparator.comparing(Employee :: getEmpName));
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		

	}

}
