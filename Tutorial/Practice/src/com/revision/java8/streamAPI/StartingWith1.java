package com.revision.java8.streamAPI;

import java.util.List;

public class StartingWith1 {
	
	public static void main(String [] args) {
		List<Integer> list = List.of(10,15,8,49,25,98,32);
		
		list.stream().map(s -> s + "").filter(s->s.startsWith("1")).forEach(s -> System.out.println(s));
	}

}
