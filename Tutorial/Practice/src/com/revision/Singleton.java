package com.revision;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Singleton s = Singleton.getInstance();
		System.out.println(s);
//		Singleton s2= Singleton.getInstance();
//		System.out.println(s2);
		
		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton sin = constructor.newInstance();
		if (s == sin) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
