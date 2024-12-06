package com.revision.collection;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<>();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		
//		Iterator itr = set.iterator(); // 1,2,3,4
//		System.out.println(itr.next());
//		Integer i = (Integer) itr.next();
//		System.out.println(i);
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
		
		Map<String,String>map = new HashMap<>();
	    map.put("Football", "A");
	    map.put("Squash", "B");
	    map.put("Cricket", "C");
	    map.put("Hockey", "D");
	    map.put("Rugby", "E");
	    map.put("Golf", "F");
	    map.put("Archery", "G");
	    map.put(null, "H");
	    map.put(null, "Y");
	    
	    Set set = map.entrySet();
	    Iterator itr=set.iterator();
	    
	    while(itr.hasNext()) {
	    	Map.Entry entry= (Map.Entry)itr.next();
	    	System.out.println(entry.getKey()+" "+ entry.getValue());
	    }
		
	}

}
