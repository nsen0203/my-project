package com.revision;

import java.util.Scanner;

public class Fabonic {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = kb.nextInt();
		if(n==1) {
			System.out.println(0);
			return;
		}
		
		int a=0;
		int b=1;
		int c;
		System.out.print(a + " " + b);
		for(int i =3; i<=n; i++) {
			c=a+b;
			System.out.print(" " + c);
			a=b;
			b=c;
		}
	}

}
