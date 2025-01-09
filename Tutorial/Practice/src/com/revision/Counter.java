package com.revision;

public class Counter {
	
	static int i = 0;
	
	public static void increment() {
		i++;
	}
	
	public static int getValue() {
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter.increment();
		Counter.increment();
		
		int value = Counter.getValue();
		
		System.out.println(value);
		
		

	}

}
