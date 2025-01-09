package com.revision;

import java.util.Scanner;

interface PayInterface{
	void pay();
}

class DebitCard implements PayInterface{

	@Override
	public void pay() {
		System.out.println("Inside Debit Card");
	}
	
}

class CreditCard implements PayInterface{

	@Override
	public void pay() {
		System.out.println("Inside Credit Card");
	}
	
}

class Factory{
	public static PayInterface getInstance(){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter you opetion");
		String s = kb.next();
		if(s.equals("creaditCard")) {
			return new CreditCard();
		}
		
		if(s.equals("debitCard")) {
			return new DebitCard();
		}
		
		return null;
		
	}
}


public class FactoryDesignPattern {

	public static void main(String[] args) {
		
		PayInterface pay= Factory.getInstance();
		pay.pay();

	}

}
