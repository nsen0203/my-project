package com.list;

import java.util.*;

public class TestArrayToList {
	
	public static void main(String [] args) {
		
		String[] arr = {"Spring", "JDBC", "SQL", "ORM"};
		
		System.out.println(Arrays.toString(arr));
		
		List<String> list = new ArrayList<>();
		for(String s:arr) {
			list.add(s);
		}
		System.out.println(list);
		System.out.println(list.get(2));
		
		list.set(1, "SpringBoot");
		
		System.out.println(list);
		
		ListIterator<String> itr = list.listIterator(list.size());
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous()+"====");
		}
		
	}

}
