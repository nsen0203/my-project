package com.java8.complex;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.*;

public class MostRepeatedString {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
		Map<String, Long> mp = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Entry<String, Long> data = mp.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(data.getKey());
		System.out.println(data.getValue());
		
	}

}
