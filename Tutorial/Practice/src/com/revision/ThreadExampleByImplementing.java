package com.revision;

public class ThreadExampleByImplementing implements Runnable{
	
	public void run() {
		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExampleByImplementing t = new ThreadExampleByImplementing();
		Thread th = new Thread(t);
		th.start();
	}

}
