package com.objectLock;

public class ObjectLevelLock {

	public static void main(String[] args) {
		
		ObjectLevelLock obj = new ObjectLevelLock();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();

	}

	public synchronized void m1() {
		System.out.println("In mthod m1 and thread name is "+Thread.currentThread().getName());

	}

	public synchronized void m2() {
		System.out.println("In mthod m2 and thread name is "+Thread.currentThread().getName());
	}

}

class Thread1 extends Thread {
	ObjectLevelLock obj = null;
	public Thread1(ObjectLevelLock obj) {
		this.obj = obj;
	}

	public void run() {
		obj.m1();
		obj.m2();
	}

}

class Thread2 extends Thread {
	ObjectLevelLock obj = null;
	public Thread2(ObjectLevelLock obj) {
		this.obj = obj;
	}

	public void run() {
		obj.m1();
		obj.m2();
	}

}
