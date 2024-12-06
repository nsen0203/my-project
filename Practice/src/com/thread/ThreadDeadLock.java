package com.thread;

public class ThreadDeadLock {

	public static void main(String[] args) throws InterruptedException {
		
		String lock1 ="lock1";
		String lock2 ="lock2";

		Thread thread1 = new Thread(new Runnable() {

			public void run() {
				
				synchronized (lock1){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("inside thread1, inside lock1");
					synchronized(lock2) {
						System.out.println("inside thread1, inside lock2");
					}
				}

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			public void run() {
				
				synchronized (lock2){

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("inside thread2, inside lock2");
					synchronized(lock1) {
						System.out.println("inside thread2, inside lock1");
					}
				}

			}
		});
		
		
		
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();

	}

}
