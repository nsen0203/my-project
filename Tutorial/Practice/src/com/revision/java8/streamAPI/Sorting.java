package com.revision.java8.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect2);
	
	}

}
