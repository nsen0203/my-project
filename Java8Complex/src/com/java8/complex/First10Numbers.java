package com.java8.complex;

import java.util.stream.IntStream;

public class First10Numbers {
	
	public static void main(String [] args) {
		
		int sum = IntStream.range(1, 11).sum();
		System.out.println(sum);
		
	}

}
