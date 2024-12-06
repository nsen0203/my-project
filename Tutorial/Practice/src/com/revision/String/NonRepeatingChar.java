package com.revision.String;

import java.util.Scanner;

public class NonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter String");
		String s = kb.next();
		
		for(char ch: s.toCharArray()) {
			if(s.indexOf(ch) == s.lastIndexOf(ch)) {
				System.out.println("The first character which is not repeating is: "+ ch);  
			}
		}

	}

}
