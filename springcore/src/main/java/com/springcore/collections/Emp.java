package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	private String name;
	private List<String> phone;
	private Set<String> addresses;
	
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, List<String> phone, Set<String> addresses, Map<String, String> course) {
		super();
		this.name = name;
		this.phone = phone;
		this.addresses = addresses;
		Course = course;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourse() {
		return Course;
	}
	public void setCourse(Map<String, String> course) {
		Course = course;
	}
	private Map<String, String> Course;
	

}
