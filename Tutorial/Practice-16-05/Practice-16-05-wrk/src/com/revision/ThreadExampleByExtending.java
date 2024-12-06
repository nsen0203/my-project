package com.revision;

public class ThreadExampleByExtending extends Thread{
	
	public void run() {
		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExampleByExtending t = new ThreadExampleByExtending();
		t.start();

	}

}
