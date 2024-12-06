package com.revision.String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		String s1 = "jaav";
		char[] a = s.toCharArray();
		char[] b = s1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		String s2 = new String(a);
		String s3 = new String(b);
		if (s2.equals(s3)) {
			System.out.println("anagram");
		} else {
			System.out.println("not");
		}
	}

}
