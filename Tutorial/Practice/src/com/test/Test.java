package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<>();
	    Employee e1 = new Employee("Ajay",35);
	    Employee e2 = new Employee("Vijay",5);
	    Employee e3 = new Employee("Zack",30);
	    Employee e4 = new Employee("David",51);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		Collections.sort(employees, (e8, e9) -> e1.getFirstName().compareTo(e2.getFirstName()));
		
	}

}
