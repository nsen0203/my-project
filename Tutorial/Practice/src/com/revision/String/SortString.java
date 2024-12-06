package com.revision.String;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		char[] s = s1.toCharArray();
		Arrays.sort(s);
		String s2 = new String(s);
		System.out.println(s2);
	}

}
