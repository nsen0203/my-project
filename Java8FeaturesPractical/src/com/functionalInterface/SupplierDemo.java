package com.functionalInterface;

import java.util.List;
import java.util.stream.Collectors;

public class SupplierDemo{

	public static void main(String[] args) {
		
		//Supplier code
//		AccountNames act = () -> List.of("Ram", "Shyam", "Dev");
//		System.out.println(act.accountDt());
		
		//Predicate code
//		List<Integer> list = List.of(2, 8, 9, 1);
//		
//		List<Integer> collect = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
//		System.out.println(collect);
		
		//Consumer
		AccountNames act = names -> System.out.println("Hello " + names);
		
		act.accountDt("John");

		
	}
}
