package com.revision.java8.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class FIrstInteger {
	
	public static void main(String [] args) {
		List<Integer> list = List.of(10,15,8,49,25,98,98,32,15);
		list.stream().findFirst().ifPresent(n -> System.out.println(n));
	}

}
