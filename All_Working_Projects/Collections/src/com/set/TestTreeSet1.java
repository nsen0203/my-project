package com.set;

import java.util.*;

public class TestTreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> set=new TreeSet<String>();
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------------------------");
		
		Iterator<String> itr1 = set.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("---------------------------");
		
		System.out.println(set.pollFirst());
		
		System.out.println("---------------------------");
		
		System.out.println(set.pollLast());

	}

}
