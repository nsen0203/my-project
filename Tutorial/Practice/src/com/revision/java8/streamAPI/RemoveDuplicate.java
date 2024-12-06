package com.revision.java8.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To find distinct
//		List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 71, 32, 95, 14, 56, 87);
//		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
//		System.out.println(collect);
		
		//To count each character
//		String str = "Java Concept Of The Day";
//		Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect);
		
		//To count each element
//		List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
//		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect);
		
		//To get Maximum and minimum
		List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 71, 32, 95, 14, 56, 87);
		Integer integer = list.stream().max(Comparator.naturalOrder()).get();
		Integer integer2 = list.stream().min(Comparator.naturalOrder()).get();
		System.out.println(integer);
		System.out.println(integer2);
		

	}

}
