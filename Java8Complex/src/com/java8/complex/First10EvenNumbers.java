package com.java8.complex;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class First10EvenNumbers {
	
	public static void main(String [] args) {
		IntStream.rangeClosed(1, 10).map(i->i*2).forEach(n -> System.out.println(n));
		
//		List<String> list = List.of("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
//		
//		Map<String, Long> map = list.stream().filter(x-> Collections.frequency(list, x) > 2).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(map);
	}

}
