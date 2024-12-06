package com.functionalInterface;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Using single argument
//		FunctionalInterface obj = a -> System.out.println(a);
//		
//		obj.showNum(55);
		
		
		//Using two argument
//		FunctionalInterface obj = (a,b) -> {
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println(a+b);
//			
//		};
//
//		obj.showNum(10,60);
		
		
		//Using return keyword
		FunctionalInterface obj = (a,b) -> {return (a+b);};
		
		System.out.println(obj.showNum(50, 10));
		
		
		
		
	}

}
