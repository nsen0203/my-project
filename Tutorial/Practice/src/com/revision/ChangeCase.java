package com.revision;

public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "JaVa";
		char ch;
		String s1 = "";
		for(int i =0; i<=s.length()-1; i++) {
			ch = s.charAt(i);
			if(ch>'A' && ch<'Z') {
				s1 = s1 + Character.toLowerCase(ch);
			}
			else {
				s1 = s1 + Character.toUpperCase(ch);
			}
		}
		System.out.println(s1);

	}

}
