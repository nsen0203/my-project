package com.revision.java8.streamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("AA", "BB", "AA", "CC");
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
		
	}

}
