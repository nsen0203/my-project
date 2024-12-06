package com.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//filter(predicate) method
		
		List<String> names = List.of("Aman", "Abhinav", "Ankit", "Durgesh");
		//names.stream().filter(e -> e.startsWith("A")).forEach(e -> System.out.println(e));
		List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
		System.out.println("----------------------");
		
		
		//Using map() 
		List<Integer> num = List.of(12,9,7,15);
//		List<Integer> newNum = num.stream().map(i -> i*i).collect(Collectors.toList());
//		System.out.println(newNum);
		num.stream().map(i -> i*i).forEach(i -> System.out.println(i));
		System.out.println("----------------------");
		
		//sorted() of stream
		
		num.stream().sorted().forEach(System.out::println);
		
		System.out.println("----------------------");
		
		//min() of stream
		Integer n = num.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println(n);

	}

}
