package com.abstractFactory;

public class EmployeeFactory {
	
	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
	}

}
