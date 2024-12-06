package com.revision.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = null;
		
		Optional<String> optional = Optional.ofNullable(s);
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		else {
			System.out.println("Running else part");
		}

	}

}
