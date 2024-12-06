package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class C {
	
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public C() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "C [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		
		System.out.println("Starting method");
	}
	
	@PreDestroy
	public void end() {
		
		System.out.println("Ending method");
		
	}
	

}
