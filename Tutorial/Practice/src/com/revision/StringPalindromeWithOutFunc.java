package com.revision;

public class StringPalindromeWithOutFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "nitin";
		int start = 0;
		int end = 0;
		
		while(true) {
			try {
				s.charAt(end);
				end++;
			}catch(Exception e) {
				break;
			}
		}
		
		while(start<end/2) {
			if(s.charAt(start)!=s.charAt(end-start-1)) {
				System.out.println("Not a palindrome");
				return;
			}
			start++;
		}
		System.out.println("Its a palindrome");

	}

}
