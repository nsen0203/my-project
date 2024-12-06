package com.list;

import java.util.*;

public class TestVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new Vector<String>();
		list.add("abc");
		list.add("dfg");
		list.add("kjh");
		list.add("nmb");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
