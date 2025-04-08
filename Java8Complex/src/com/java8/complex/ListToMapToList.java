package com.java8.complex;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToMapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "one");
//		map.put(2, "two");
//		map.put(3, "three");
//		
//		List<Integer> collect = map.keySet().stream().collect(Collectors.toList()); 
//		System.out.println(collect); //[1, 2, 3]
//
//		List<String> collect2 = map.values().stream().collect(Collectors.toList());
//		System.out.println(collect2); //[one, two, three]
//		
//		List<Entry<Integer, String>> collect3 = map.entrySet().stream().collect(Collectors.toList());
//		System.out.println(collect3); //[1=one, 2=two, 3=three]
		
		List<String> list = Arrays.asList("One", "Second", "third");
		
		Map<Integer, String> collect = IntStream.range(0, list.size()).boxed().collect(Collectors.toMap(i -> i, list::get));
		System.out.println(collect);//{0=One, 1=Second, 2=third}
		
		Map<String, Integer> collect2 = list.stream().collect(Collectors.toMap(i->i, String::length));
		System.out.println(collect2); //{Second=6, third=5, One=3}
		
	}

}
