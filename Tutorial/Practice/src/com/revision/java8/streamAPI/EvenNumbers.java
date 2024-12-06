package com.revision.java8.streamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class EvenNumbers {
	
	public static void main(String[] args) {
		//List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		List<Integer> list = List.of(10,15,8,49,25,98,32);
		List<Integer> collect = list.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		System.out.println(collect);
	}

}
