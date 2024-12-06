package com.dxc.personal;

public class Singleton {
	private static Singleton s=null;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(s==null)
			s=new Singleton();
		return s;
	}
	public static void main(String[]args) {
		Singleton s1=Singleton.getInstance();
		System.out.println(s1);
		Singleton s2=Singleton.getInstance();
		System.out.println(s2);
	}
}
