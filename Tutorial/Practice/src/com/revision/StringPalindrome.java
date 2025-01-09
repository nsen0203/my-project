package com.revision;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Madam";
		int l = s.length();
		for(int i = 1; i<=l/2; i++) {
			if(s.charAt(i)!=s.charAt(l-1-i)) {
				System.out.println("Not a palindrome");
				return;
			}
		}
		System.out.println("Its a palindrome");

		
	}

}
