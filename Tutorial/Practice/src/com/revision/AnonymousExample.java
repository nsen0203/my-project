package com.revision;

import java.util.Collections;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInter my = new MyInter() {
			
			public void show() {
				System.out.println("Anonymous Testing");
			}
			
		};
		my.show();
		
		
		Comparator<Employee> com = new Comparator<Employee>() {
			
			public int comapre(Employee e1, Employee e2) {
				return e1.getName().comapreTo(e2.getName());
			}
			
		};
		
		Collections.sort(emp, com);

	}

}
