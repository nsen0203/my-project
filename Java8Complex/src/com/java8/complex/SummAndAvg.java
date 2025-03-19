package com.java8.complex;

import java.util.*;

public class SummAndAvg {
	
	public static void main(String[] args) {
		int []a = new int[] {2,9,8,7,9};
		
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);
		
		double avg = Arrays.stream(a).average().getAsDouble();
		System.out.println(avg);
	}

}
