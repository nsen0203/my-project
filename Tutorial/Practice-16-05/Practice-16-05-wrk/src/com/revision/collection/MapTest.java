package com.revision.collection;

import java.util.*;

public class MapTest {
	
	public static void main(String [] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Ram");
		map.put(2, "Shyam");
		map.put(3, "Nick");
		
		Set set=map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
