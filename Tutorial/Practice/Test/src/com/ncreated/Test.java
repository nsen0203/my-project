package com.ncreated;

import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String s = "Nitin";
//		
//		
//		
//		for(int i = 0; i<=s.length()-1; i++) {
//			
//		}		
		
		//predicate
		
//		List<Employee> list = new ArrayList<>();
//		
//		List<Employee> list1=list.stream().sorted.((a,b) -> a.getSalary.comapreTo(b.getSalary())).collect(Collectors.toList());
		
		//List<Employee> list2=lis1.stream().sorted.((a,b) -> a.getName.compareTo(b.getName())).collect(Collectors.toList());
//		import java.util.*;
//		import java.util.stream.*;
//
//		class Employee {
//		    private String name;
//		    private int salary;
//		    private int age;
//
//		    public Employee(String name, int salary, int age) {
//		        this.name = name;
//		        this.salary = salary;
//		        this.age = age;
//		    }
//
//		    public String getName() {
//		        return name;
//		    }
//
//		    public int getSalary() {
//		        return salary;
//		    }
//
//		    public int getAge() {
//		        return age;
//		    }
//
//		    @Override
//		    public String toString() {
//		        return "Employee{name='" + name + "', salary=" + salary + ", age=" + age + '}';
//		    }
//		}
//
//		public class EmployeeSorter {
//		    public static void main(String[] args) {
//		        List<Employee> employees = Arrays.asList(
//		            new Employee("Alice", 5000, 30),
//		            new Employee("Bob", 6000, 25),
//		            new Employee("Charlie", 5000, 28),
//		            new Employee("David", 6000, 35),
//		            new Employee("Eve", 4000, 40)
//		        );
//
//		        // Sort employees using Stream API
//		        List<Employee> sortedEmployees = employees.stream()
//		            .sorted((e1, e2) -> {
//		                // First compare by salary
//		                int salaryComparison = Integer.compare(e1.getSalary(), e2.getSalary());
//		                if (salaryComparison != 0) {
//		                    return salaryComparison;
//		                }
//		                // If salary is the same, compare by age
//		                return Integer.compare(e1.getAge(), e2.getAge());
//		            })
//		            .collect(Collectors.toList());
//
//		        // Output the sorted list
//		        sortedEmployees.forEach(System.out::println);
//		    }
//		}

		
		//To get 11th salary
		Select min(Salary) from Employee where salary In (select Top(11) Salary from Person Order by Salary Desc);
		
		
	}

}
