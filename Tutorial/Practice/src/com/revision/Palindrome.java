package com.revision;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = kb.nextInt();
		int a = n;
		int m = 0;
		while(n>0) {
			m = (m*10) + (n%10);
			n/=10;
		}
		if(a==m) {
			System.out.println("Its a palindrome");
		}
	}

}
