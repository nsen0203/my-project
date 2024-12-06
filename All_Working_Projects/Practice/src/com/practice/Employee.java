package com.practice;

//public class Employee implements Comparable<Employee> {
//	
//	private String name;
//	private String city;
//	private int empId;
//	
//	public int compareTo(Employee e) {
//		return this.empId-e.empId;
//	}
//	
//	public Employee(String name, String city, int empId) {
//		super();
//		this.name = name;
//		this.city = city;
//		this.empId = empId;
//	}
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", city=" + city + ", empId=" + empId + "]";
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	
//
//}


public class Employee {
	
	private String name;
	private String city;
	private int empId;
	
	public int compareTo(Employee e) {
		return this.empId-e.empId;
	}
	
	public Employee(String name, String city, int empId) {
		super();
		this.name = name;
		this.city = city;
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", empId=" + empId + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	

}

