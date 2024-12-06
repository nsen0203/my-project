package com.revision.java8.streamAPI;

import java.util.*;

public class MaximumMinimum {
	
	public static void main(String [] args) {
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Integer integer = list.stream().max((a,b) -> Integer.compare(a, b)).get();
		System.out.println(integer);
		
		Integer integer2 = list.stream().min((a,b) -> Integer.compare(a, b)).get();
		System.out.println(integer2);
}

}
