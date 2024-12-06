package com.dxc.personal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s= new ArrayList<String>();
		s.add("t1");
		s.add("t2");
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
