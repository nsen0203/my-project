package com.dxc.innerclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A(10);
		A a2=new A(20);
		A.B b1=a1.new B();
		b1.m1();
	}

}
