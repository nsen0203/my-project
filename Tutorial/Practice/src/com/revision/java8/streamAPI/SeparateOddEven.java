package com.revision.java8.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class SeparateOddEven {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		
		Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i -> i%2==0));
		System.out.println(collect);

	}

}
