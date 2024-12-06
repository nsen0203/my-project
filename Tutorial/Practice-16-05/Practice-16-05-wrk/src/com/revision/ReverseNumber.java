package com.revision;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		//First way
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = kb.nextInt();
		while(n>0) {
			System.out.println(n%10);
			n/=10;
			 
		}
		
		//Second way
//		Scanner kb = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n = kb.nextInt();
//		int m=0;
//		while(n>0) {
//			m=(m*10) + (n%10);
//			n/=10;
//		}
//		System.out.println(m);
		
		
		
	}

}
