package com.revision.String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		System.out.println(RemoveDuplicate.RemoveDupl(s1));
	}

	public static String RemoveDupl(String s1) {
		StringBuffer s = new StringBuffer();
		Set a1 = new HashSet<String>();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (!a1.contains(ch)) {
				a1.add(ch);
				s.append(ch);
			}
		}
		return s.toString();
	}
}
