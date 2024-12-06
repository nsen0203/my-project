package com.revision;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test1();
		t1.m1(10);

	}

}

class Test{
	public void m1(int i) {
		System.out.println("m1 in Test with i as a parameter");
	}
}

class Test1 extends Test{
	public void m1(int i) {
		System.out.println("m1 in Test1 with i as paramter");
	}
}
