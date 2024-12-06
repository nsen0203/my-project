package com.revision;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		int a=1;
		for (int i=2; i<n/2; i++) {
			if(n%i==0) {
				System.out.println("Not a prime");
				a=0;
			}
		}
		if(a==1) {
			System.out.println("Its a prime number");
		}

	}

}
