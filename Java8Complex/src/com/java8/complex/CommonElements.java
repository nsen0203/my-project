package com.java8.complex;

import java.util.*;
import java.util.stream.*;

public class CommonElements {
	
	public static void main(String [] args) {
		
		List<Integer> list1 = List.of(71, 21, 34, 89, 56, 28);
		
		List<Integer> list2 = List.of(12, 56, 17, 21, 94, 34);
		
		list1.stream().filter(list2::contains).forEach(n -> System.out.println(n));
		
	}

}
