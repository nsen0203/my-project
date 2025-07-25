package com.java8.advance.question;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Map.*;

public class FetchMaxSalFromEaachDep {
	
	public static void main(String[] args) {
		
		List<Employee> emplist = new ArrayList<>();
		
		emplist.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		emplist.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		emplist.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		emplist.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		emplist.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		emplist.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		emplist.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		emplist.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		emplist.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		emplist.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		emplist.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		emplist.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		emplist.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		emplist.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		emplist.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		emplist.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		emplist.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		Map<String, Optional<Employee>> collect = emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()))));
		Set<Entry<String, Optional<Employee>>> entrySet=collect.entrySet();
		
		for(Entry<String, Optional<Employee>> entry: entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		// Find the sum of salaries for each city
//        Map<String, Double> salarySumByCity = employees.stream()
//                .collect(Collectors.groupingBy(
//                        Employee::getCity,
//                        Collectors.summingDouble(Employee::getSalary)
//                ));
	}

}
