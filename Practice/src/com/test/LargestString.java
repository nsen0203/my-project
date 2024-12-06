package com.test;

public class LargestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str = {"code","speedy","is","very","good","at","providing","content"};
		int l = str[0].length(), len=0;
		String s1="";
		for(int i=0; i<str.length; i++) {
			len=str[i].length();
			if(len>l) {
				l=len;
				s1=str[i];
			}
		}
		
		System.out.println(s1);

	}

}
