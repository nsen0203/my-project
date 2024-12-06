package com.revision.comp;

import java.util.*;

public class Comparable {
	
	public static void main(String [] args) {
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Ram"));
		emp.add(new Employee(2, "Shyam"));
		emp.add(new Employee(3, "Nick"));
		
		
		System.out.println(emp);
		
//		Iterator<Employee> itr = emp.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		for (Employee e: emp) {
//			System.out.println(e);
//		}
		
		//Collections.sort(emp);
		
		Collections.sort(emp, new NameComparator());
		System.out.println(emp);
//		Collections.sort(emp, new IdComparator());
//		System.out.println(emp);
		
	}

}
