package com.revision.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = List.of(10,20,30,40,50);
		
//		Optional<Integer> findFirst = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst();
//		//System.out.println(findFirst);
//		findFirst.ifPresent(number -> System.out.println(number));
		
		Optional<Integer> findFirst = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		findFirst.ifPresent(n -> System.out.println(n));

	}

}
