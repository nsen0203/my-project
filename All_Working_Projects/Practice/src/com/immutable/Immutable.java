package com.immutable;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("12344");
		String num = e.getN();
		System.out.println("String number is " + num);
		
		Employee e1 = new Employee("1234455");
		String num1 = e1.getN();
		System.out.println("String changed value is " + num1);

	}

}
