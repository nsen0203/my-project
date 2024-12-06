package com.revision.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(20);
		list1.add(25);
		list1.add(15);
		list1.add(10);
		list1.add(33);
		list1.add(44);
		
//		List<Integer> stream = list1.stream().filter(i -> i%2==0).collect(Collectors.toList());
//		System.out.println(stream);
		
//		List<Integer> stream = list1.stream().filter(i -> i>10).collect(Collectors.toList());
//		System.out.println(stream);
		
		List<Integer> stream = list1.stream().map(i -> i*10).collect(Collectors.toList());
		System.out.println(stream);
		
//		Integer stream = list1.stream().min((x,y) -> x.compareTo(y)).get();
//		System.out.println(stream);

	}

}
