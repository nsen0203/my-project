package com.set;

import java.util.*;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(null);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
