package com.dxc.innerclass;

public class A {
	int i;
	A(int i){
		this.i=i;
	}
	class B{
		public void m1() {
			System.out.println("Inside non-static class B");
		}
	}

}
