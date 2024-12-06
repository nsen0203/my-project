package com.revision.String;

public class ReverseWholeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to java world";
		String[] s1 = s.split(" ");
		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.print(s1[i] + " ");
		}
	}
}
