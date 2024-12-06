package com.map;

import java.util.*;
import java.util.Map.Entry;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new HashMap();
		map.put(1, "Amit");
		map.put(5, "James");
		map.put(3, "Dave");
		map.put(2, "Amit");
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
	}
}
