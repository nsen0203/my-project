package com.java8.complex;

import java.util.*;
import java.util.stream.*;

public class AllDigitsAdd {
	
	public static void main(String [] args) {
		
//		int i = 14332;
//		
//		int data = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
//		System.out.println(data);
		
		List<String> list = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		list.stream().sorted((a,b) -> Integer.compare(a.length(), b.length())).collect(Collectors.toList()).forEach(n-> System.out.println(n));
		//System.out.println(data);
	}

}
