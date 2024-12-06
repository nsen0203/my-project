package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ajay",35));
		employees.add(new Employee("Vijay",5));
		employees.add(new Employee("Zack",30));
		employees.add(new Employee("David",51));
		
		
		//List<Employee> collect = employees.stream().filter(e -> e.getAge()>30).collect(Collectors.toList());
		//System.out.println(collect);
		
		
	}

}
