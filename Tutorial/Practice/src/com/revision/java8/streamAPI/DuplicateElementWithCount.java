package com.revision.java8.streamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementWithCount {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "AA", "CC", "BB");
		Map<String, Long> collect = list.stream().filter(x-> Collections.frequency(list, x) >1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
	}

}
