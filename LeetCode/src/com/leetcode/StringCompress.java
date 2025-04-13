package com.leetcode;

public class StringCompress {
	
	public static void main(String [] args) {
		char [] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
		int n = chars.length;
		int index=0;
		int start=0;
		
		while(start<n) {
			int end = start;
			
			while(end<n && chars[start] == chars[end]) {
				end++;
			}
			
			int count = end - start;
			
			chars[index ++] = chars[start];
			if(count>=2) {
				
				char[] freq = Integer.toString(count).toCharArray();
				
				for(char ch : freq) {
					chars[index++] = ch;
				}
			}
			start = end;
		}
		
		System.out.println(index);
	}
}
