package com.optional;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		String s = null;
		
		Optional<String> optional=Optional.ofNullable(s);
		
		System.out.println(optional.isPresent());
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		else {
			System.out.println("Else part is running");
		}

	}

}
