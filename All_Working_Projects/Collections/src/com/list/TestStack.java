package com.list;

import java.util.*;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack=new Stack<>();
		stack.push("Spring");
		stack.push("SpringMVC");
		stack.add("SpringJDBC");
		stack.add("SpringORM");
		System.out.println(stack.peek());
		stack.add("SpringCore");
		stack.pop();
		
		Iterator<String> it = stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
