package com.objectLock;

public class ClassLevelLock {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
	
	public static synchronized void m1() {
		System.out.println("In mthod m1 and thread name is "+Thread.currentThread().getName());
	}
	
	public static synchronized void m2() {
		System.out.println("In mthod m2 and thread name is "+Thread.currentThread().getName());
	}

}

class Thread1 extends Thread{
	ClassLevelLock loc = null;
	
	public void run() {
		loc.m1();
		loc.m2();
	}
}

class Thread2 extends Thread{
	ClassLevelLock loc1 = null;
	
	public void run() {
		loc1.m1();
		loc1.m2();
	}
}
