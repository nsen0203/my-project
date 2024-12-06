package com.revision.String;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "madam", s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			s2 = ch + s2;
		}
		if (s1.equals(s2)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not");
		}
	}

}
