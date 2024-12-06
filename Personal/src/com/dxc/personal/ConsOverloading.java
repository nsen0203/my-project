package com.dxc.personal;

public class ConsOverloading {

	public ConsOverloading(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Inside integer");
	}

	public ConsOverloading(float f) {
		// TODO Auto-generated constructor stub
		System.out.println("Inside float");
	}

	public ConsOverloading(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("Inside string");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsOverloading c1=new ConsOverloading(10);
		ConsOverloading c2=new ConsOverloading(10.0f);
		ConsOverloading c3=new ConsOverloading("String");

	}

}
