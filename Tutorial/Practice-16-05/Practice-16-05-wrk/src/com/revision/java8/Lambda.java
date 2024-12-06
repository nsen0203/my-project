package com.revision.java8;

import java.util.Collections;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = (a,b) -> {
			return(a+b);
		};
		
		System.out.println(t.show(10, 20));
		
		
//		Collections.sort(list, new Comparator<Employee>() {
//			public int compare(Employee e1, Employee e2) {
//				return e1.getName().compareTo(e2.getName());
//			}
//		});
//		System.out.println(list);
		
//		Collections.sort(list, (Employee e1, Employee e2)-> e1.getName().compareTo(e2.getName()));
//		System.out.println(list);
		
	}

}
