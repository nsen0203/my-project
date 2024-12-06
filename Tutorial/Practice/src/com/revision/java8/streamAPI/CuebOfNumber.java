package com.revision.java8.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class CuebOfNumber {
	
	public static void main(String [] args) {
		List<Integer> list = List.of(4,5,6,7,1,2,3);
		list.stream().map(i -> i*i*i).collect(Collectors.toList()).forEach(n -> System.out.println(n));
	}

}
