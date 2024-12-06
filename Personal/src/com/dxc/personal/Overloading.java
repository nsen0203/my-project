package com.dxc.personal;

public class Overloading {
	
	public void m1(int i) {
		System.out.println("Integer Block");
	}
	public void m1(float f) {
		System.out.println("Float Block");
	}

	public static void main(String[] args) {
		Overloading o1=new Overloading();
		o1.m1(10);
		o1.m1(10.5f);

	}

}
