package com.set;

import java.util.*;

public class TestHashSet {
	
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
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
