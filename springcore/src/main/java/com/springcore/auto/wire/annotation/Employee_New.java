package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee_New {
	
	@Autowired
	private Address1 address;

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	public Employee_New() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee_New(Address1 address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
