package com.test;

public class RevereEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		String[]  s1 = s.split(" ");
		for(String str: s1) {
			char[] charArray = str.toCharArray();
			int left = 0;
			int right = charArray.length - 1;
			while(left<right) {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}
			System.out.print(charArray);
			System.out.print(" ");
		}

	}

}
