package com.revision.java8.streamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortingAcLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To sort element according to length
//		List<String> list = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
//		list.stream().sorted((a, b) -> Integer.compare(a.length(), b.length())).forEach(n -> System.out.println(n));
		
		//To get element which are appearing more than once
		List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
		Map<String, Long> collect = list.stream().filter(x -> Collections.frequency(list, x)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
		
	}

}
