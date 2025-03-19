package com.java8.complex;

import java.util.stream.*;

public class Palindrome {
	
	public static void main(String [] args) {
		
		String str = "madam";
		
		boolean data = IntStream.range(0, str.length()/2).noneMatch(i -> str.charAt(i) != str.charAt(str.length()-1-i));
		
		if(data) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
	}

}
