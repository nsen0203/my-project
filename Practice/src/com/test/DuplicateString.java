package com.test;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "beautiful beach";
		char[] stringchar = str.toCharArray();
		for (int i = 0; i<stringchar.length;i++) {
			for (int j = i+1; j<stringchar.length;j++) {
				if (stringchar[i] == stringchar[j]) {
					System.out.println(stringchar[j]);
				}
			}
		}

	}

}
