package com.revision.comp;

public class Employee {
	
	private int id;
	private String name;
	
//	public int compareTo(Employee e) {
//		return this.id-e.id;
//	}
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}


