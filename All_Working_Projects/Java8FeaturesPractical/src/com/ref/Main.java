package com.ref;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Learning method reference");
		
		//provide implementation for functional interface method
		WorkInter inter = () -> {
			System.out.println("Functional interface methods implementation");
		};
		
		inter.doTask();
		
		System.out.println("-----------------");
		
		//static method reference
		WorkInter inter1 = Test::test;
		inter1.doTask();
		
		Runnable runnable = Test::threadTest;
		Thread th = new Thread(runnable);
		th.start();
		
		//non-static method reference
		
		Test t = new Test();
		Runnable thread = t::printNum;
		//Runnable thread = new Test()::printNum;
		Thread th1 = new Thread(thread);
		th1.start();

	}

}
