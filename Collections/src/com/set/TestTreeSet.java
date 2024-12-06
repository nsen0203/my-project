package com.set;

import java.util.*;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new TreeSet<>();
		set.add("Spring");
		set.add("SpringJDBC");
		set.add("SpringORM");
		set.add("Spring");

		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
