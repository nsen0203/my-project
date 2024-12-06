package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thurday");
		list.add("Friday");
		list.add("Saturday");
		list.add("Sunday");
		
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext()) {
//			String s = itr.next();
////			if(s.startsWith("S")) {
////				System.out.println(s);
////			}
////			if(s.startsWith("S") || s.startsWith("s")) {
////				System.out.println(s);
////			}
//			
//		}
		
		List<String> streamList = list.stream().filter(i -> i.startsWith("S")).collect(Collectors.toList());
		System.out.println(streamList);

	}

}
