package com.set;

import java.util.*;

public class TestHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<String> set = new HashSet<>();
//		set.add("SpringORM");
//		set.add("Spring");
//		set.add("JDBC");
//		set.add("JDBC");
//		
//		Iterator<String> itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		set.remove("Spring");
//		
//		//System.out.println(set);
//		
//		set.add("Spring");
//		
//		//System.out.println(set);
//		
//		Set<String> set1 = new HashSet<String>();
//		set1.add("SpringMVC");
//		set1.add("SpringJDBC");
//		
//		//System.out.println(set1);
//		
//		set.addAll(set1);
//		
//		System.err.println(set);
//		
//		set.removeAll(set1);
//		
//		System.err.println(set);
//		
//		set.clear();
//		
//		System.out.println(set);
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Jdbc");
		list.add("JAVA");
		list.add("SQL");
		
		
		Set<String> set = new HashSet<String>(list);
		set.add("Spring");
		set.add("Python");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
