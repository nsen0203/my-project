package com.revision.java8.streamAPI;
import java.util.*;

public class TotalInteger {
	
	public static void main(String [] args) {
		List<Integer> list = List.of(10,15,8,49,25,98,98,32,15);
		long count = list.stream().count();
		System.out.println(count);
		
	}

}
