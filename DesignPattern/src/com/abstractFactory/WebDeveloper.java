package com.abstractFactory;

public class WebDeveloper implements Employee{
	
	@Override
	public int salary() {
		return 60000;
	}

	@Override
	public String name() {
		System.out.println("I am a web developer");
		return "Web developer";
		
		
	}

}
