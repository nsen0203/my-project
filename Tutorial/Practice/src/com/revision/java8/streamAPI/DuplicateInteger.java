package com.revision.java8.streamAPI;

import java.util.*;

public class DuplicateInteger {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = new HashSet<>();
		list.stream().filter(n -> !set.add(n)).forEach(n -> System.out.println(n));

	}

}
