package com.revision;

public class EachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "banana";
		String s1 = "";
		char ch;
		int count = 0;
		while(s.length()>0) {
			ch = s.charAt(0);
			s1 = s.replace(ch + "", "");
			count = s.length()-s1.length();
			System.out.println(ch + " " + count);
			s=s1;
		}
		

	}

}
