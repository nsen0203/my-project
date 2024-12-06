package com.revision.java8.streamAPI;

import java.util.*;

public class FirstRepeated {
	
	public static void main(String[] args) {
		String str = "Java articles are Awesome";
		Set<Character> set= new HashSet<>();
		Optional<Character> findFirst = str.chars().mapToObj(c -> (char) c).filter(c -> !set.add(c)).findFirst();
		System.out.println(findFirst);
	}

}
