package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
	
	public static void main(String[] args) {
		
		//Creating list in 3 ways
		
		//first way of creating list
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(20);
		list1.add(25);
		list1.add(15);
		list1.add(10);
		list1.add(33);
		list1.add(44);
		
		
		//second way of creating list using of() but this list will immutable we cannot add element later
		
		List<Integer> list2=List.of(1,6,3,7,8,9);
		
		
		//third way of creating list using Arrays() but this list will immutable we cannot add element later
		
		List<Integer> list3 = Arrays.asList(3,7,4,6,8,9);
		
		
		//doing operations on list1 without using stream
		List<Integer> listEven = new ArrayList<>();
		
		for(Integer i: list1) {
			if(i%2==0) {
				listEven.add(i);
			}
		}
		
		System.out.println(list1);
		System.out.println(listEven);
		
		
		//with stream API
//		Stream<Integer> stream = list1.stream();
//		List<Integer> streamList = stream.filter(i -> i%2==0).collect(Collectors.toList());
//		System.out.println(streamList);
		
		//with stream API using in-line functionality
		List<Integer> streamList = list1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(streamList);
		
		List<Integer> streamList1 = list1.stream().filter(i -> i>10).collect(Collectors.toList());
		System.out.println(streamList1);
		
	}

}
