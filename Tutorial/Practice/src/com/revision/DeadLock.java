package com.revision;

public class DeadLock {

	public static void main(String[] args) throws InterruptedException {
		String lock1 = "lock1";
		String lock2 = "lock2";

		Thread t1 = new Thread() {

			public void run() {
				synchronized (lock1) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("inside thread1, lock1");
					synchronized (lock2) {
						System.out.println("inside thread1, lock2");
					}
				}
			}

		};

		Thread t2 = new Thread() {

			public void run() {
				synchronized (lock2) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("inside thread2, lock2");
					synchronized (lock1) {
						System.out.println("inside thread2, lock1");
					}
				}
			}

		};
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}
