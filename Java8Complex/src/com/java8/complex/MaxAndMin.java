package com.java8.complex;

import java.util.*;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = List.of(10,20,80,70,30);
		//int max = list.stream().max(Comparator.naturalOrder()).get();
		int max = list.stream().max((a,b) -> a.compareTo(b)).get();
		System.out.println(max);

	}

}
