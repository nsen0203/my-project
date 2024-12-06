package com.revision.java8.streamAPI;

import java.util.Optional;

public class FirstNonRepeated {
	
	public static void main(String [] args) {
		String str = "Java articles are Awesome";
		Optional<Character> findFirst = str.chars().mapToObj(c -> (char) c).filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch)).findFirst();
		System.out.println(findFirst);
	}

}
