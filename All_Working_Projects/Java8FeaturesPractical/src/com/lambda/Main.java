package com.lambda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Basic way to call sayHello()
//		MyInter inter = new MyInterImpl();
//		inter.sayHello();
		
		//using anonymous class
//		MyInter i = new MyInter() {
//			public void sayHello() {
//				System.out.println("Using anonymous class");
//			}
//		};
//		i.sayHello();
//		
//		
//		MyInter i1 = new MyInter() {
//			public void sayHello() {
//				System.out.println("Using i1 anonymous class");
//			}
//		};
//		i1.sayHello();
		
		
		//Using Lambda expression
//		MyInter i = () -> {
//			System.out.println("This is the first time i am using lambda expression");
//		};
//		
//		i.sayHello();
//		
//		MyInter i1 = () ->{
//			System.out.println("This is the second time i am using lambda expressions");
//		};
//		
//		i1.sayHello();
//		
//		MyInter i2 = ()-> System.out.println("Using inline functionality in lambda expression");
//		
//		i2.sayHello();
		
		
		//Sum using lambda expression
		
//		SumInter s = (int a, int b)->{return (a+b);};
//		
//		System.out.println(s.sum(60,2));;
		
		//Another way of writing sum code using lambda expression
		
//		SumInter s = (a,b) -> a+b;
//		System.out.println(s.sum(10, 90));;
		
		
		//calculating length of string
		LengthInter len = (str) -> str.length();
		
		System.out.println(len.getLength("JavaProgramming"));
		
		
		
		

	}

}
