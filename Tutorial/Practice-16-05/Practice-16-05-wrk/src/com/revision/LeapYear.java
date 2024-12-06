package com.revision;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a year");
		int n = scn.nextInt();
		if (n%400==0) {
			System.out.println("its a leap year");
		}
		else if (n%4==0 && n%100!=0) {
			System.out.println("its a leap year");
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
