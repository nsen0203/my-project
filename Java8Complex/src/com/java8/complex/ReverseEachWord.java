package com.java8.complex;

import java.util.*;
import java.util.stream.*;

public class ReverseEachWord {
	
	public static void main(String [] args) {
		
		String s ="hello world";
		
		String s1 = Arrays.stream(s.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		
		System.out.println(s1);
	}

}
