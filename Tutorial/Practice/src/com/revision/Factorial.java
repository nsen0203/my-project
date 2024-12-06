package com.revision;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = kb.nextInt();
		int fact;
		for (fact = 1; n>0; n--) {
			fact = fact*n;
		}
		System.out.println("Factorial " + fact);
	}
}
