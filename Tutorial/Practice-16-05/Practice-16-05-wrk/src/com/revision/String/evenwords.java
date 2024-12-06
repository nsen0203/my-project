package com.revision.String;

public class evenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "we are hell world";
		for (String s1 : s.split(" ")) {
			if (s1.length() % 2 == 0) {
				System.out.println(s1);
			}
		}
	}
}
