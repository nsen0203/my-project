package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
	
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Nikhil", "Bina", 100));
		emp.add(new Employee("Ram", "Bhopal", 105));
		emp.add(new Employee("Shyam", "Mumbai", 103));
		emp.add(new Employee("Renu", "Delhi", 109));
		
		System.out.println(emp);
		
		//comparable concept
		//Collections.sort(emp);
		//System.out.println(emp);
		
		//comparator concept
		Collections.sort(emp, new IdComparator());
		System.out.println(emp);
		
		
		
		//Creating new list
		ArrayList<Employee> emp1 = new ArrayList<>(emp);
		
		Collections.sort(emp1, new NameComparator());
		System.out.println(emp1);
		
	}

}
