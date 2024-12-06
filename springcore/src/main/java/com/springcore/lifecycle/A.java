package com.springcore.lifecycle;

public class A {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init()");
	}
	
	public void destroy() {
		System.out.println("Inside destroy()");
	}

}
