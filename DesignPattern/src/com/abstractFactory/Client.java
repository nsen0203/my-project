package com.abstractFactory;

public class Client {

	public static void main(String[] args) {
		
		Employee employee = EmployeeFactory.getEmployee(new AndriodDevFactory());
		employee.name();
		Employee employee1 = EmployeeFactory.getEmployee(new WebDevFactory());
		employee1.name();

	}

}
