package com.java8.complex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Delimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> asList = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String collect = asList.stream().collect(Collectors.joining(", ", "[", "]"));
		System.out.println(collect);

	}

}
