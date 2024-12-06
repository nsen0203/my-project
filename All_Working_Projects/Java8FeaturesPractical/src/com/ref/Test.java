package com.ref;

import java.time.LocalDate;

public class Test {

	public static void test() {
		System.out.println("For testing purpose");
		LocalDate now = LocalDate.now();
		System.out.println(now);
	}
	
	public static void threadTest() {
		for(int i=1; i<=10;i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public void printNum() {
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
}
