package com.abstractFactory;

public class AndriodDevFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		
		return new AndroidDeveloper();
	}

}
