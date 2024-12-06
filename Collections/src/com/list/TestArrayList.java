package com.list;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("SQL");
		list.add("Hibernate");
		
		String string = list.get(2);
		System.out.println(string);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
