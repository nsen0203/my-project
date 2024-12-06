package com.immutable;

import java.util.Scanner;

public class Test {
	
	public static void main(String [] args) {
//		Scanner kb = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n = kb.nextInt();
//		int Fact = 1;
//		for(Fact = 1; n>0; n--) {
//			Fact = Fact*n;
//		}
//		System.out.println(Fact);
		
//		String s = "bananaba";
//		String s1 = "";
//		char ch;
//		int count;
//		while(s.length()>0) {
//			ch = s.charAt(0);
//			s1 = s.replace(ch +"", "");
//			count = s.length() - s1.length();
//			System.out.println(ch+"="+count);
//			s=s1;
//		}
		
		
//		String s = "JaVa";
//		String s1 = "";
//		char ch;
//		for(int i=0; i<s.length(); i++) {
//			//ch = s.charAt(i);
//			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
//				 s1 = s1 + Character.toLowerCase(s.charAt(i));
//				 //System.out.println(s1);
//			}
//			else {
//				s1 = s1 + Character.toUpperCase(s.charAt(i));
//				//System.out.println(s1);
//			}
//		}
//		System.out.println(s1);	
		
		
//		String s = "Mouse";
//		int count = 0;
//		s = s.toLowerCase();
//		for(int i = 0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			switch(ch)
//			{
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u':count ++;
//				break;
//			}
//		}
//		System.out.println(count);
		
		
//		String s = "Madam";
//	    s = s.toLowerCase();
//	    int l = s.length();
//		for (int i = 0; i <s.length(); i++) {
//			if(s.charAt(i)!= s.charAt(l-1-i) ) {
//				System.out.println("Not a palindrome");
//			}
//		}
//		System.out.println("It is a Palindrome");
		
		
		String s = "string";
		String s1 = "";
		for (int i = s.length()-1; i>=0; i--) {
			s1 = s1 + s.charAt(i);
		}
		
		System.out.println(s1);
		
	}

}
