package com.revision;

public class Singleton {
	
	private static Singleton s1 = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (s1==null) {
			s1=new Singleton();
		}
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s = Singleton.getInstance();
		System.out.println(s);
		Singleton s2= Singleton.getInstance();
		System.out.println(s2);
		
	}

}
