package com.lambda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Anonymous obj = new Anonymous() {
//			
//			public void show() {
//				System.out.println("Using Anonymous Concept");
//			}
//			
//			public void showNum(int y) {
//				System.out.println("Using Anonymous Concept"+ " "+y);
//			}
//			
//		};
//		
//		obj.show();
//		obj.showNum(20);
		
		
		
		//Lambda expression
//		Anonymous obj = () ->{
//			System.out.println("Using lambda expression concept");
//		};
		
		Anonymous obj = () -> System.out.println("Another way of writing above code using in-line functionality");
		
		obj.show();

	}

}
