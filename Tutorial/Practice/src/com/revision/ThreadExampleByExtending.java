package com.revision;

import java.util.concurrent.*;

public class ThreadExampleByExtending extends Thread{
	
//	public void run() {
//		System.out.println("Inside run method");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ThreadExampleByExtending t = new ThreadExampleByExtending();
//		t.start();
		
		ExecutorService exceutor=Executors.newFixedThreadPool(1);
		exceutor.submit(()-> System.out.println("Its separatexd thread"));
		exceutor.shutdown();

	}

}
