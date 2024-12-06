package com.test;

public class Employee {
	String firstName;
	int age;
	public Employee(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", age=" + age + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
