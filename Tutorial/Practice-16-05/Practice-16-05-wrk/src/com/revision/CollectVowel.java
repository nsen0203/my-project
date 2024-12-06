package com.revision;

public class CollectVowel {
	
	public static void main(String [] args) {
		
		String s = "elephant";
		int count=0;
		char ch;
		for(int i = 0; i <=s.length()-1; i++) {
			ch=s.charAt(i);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			
			}
		}
		System.out.println(count);
		
	}

}
