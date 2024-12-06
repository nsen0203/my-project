package com.revision;

public class MethodOverloading {
	
	public void m1(int i) {
		System.out.println("m1 with interger");
	}
	
	public void m1(float f) {
		System.out.println("m1 with float");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m = new MethodOverloading();
		m.m1(10);
		m.m1(10.0f);

	}

}
