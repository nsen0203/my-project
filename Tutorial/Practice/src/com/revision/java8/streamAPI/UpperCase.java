package com.revision.java8.streamAPI;

import java.util.*;

public class UpperCase {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("nikhil", "Ram");
		names.stream().map(s -> s.toUpperCase()).forEach(i -> System.out.println(i));
	}

}
