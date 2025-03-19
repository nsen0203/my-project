package com.java8.complex;

import java.util.*;

public class LastElementArray {
	
	public static void main(String [] args) {
		
		List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
		String str = list.stream().skip(list.size()-1).findFirst().get();
		System.out.println(str);
		
	}

}
