package com.optional;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String[] args) {
		String str = "Nikhil";
		
		Optional<String> optional = Optional.ofNullable(str);
		
		System.out.println(optional.isPresent());
		
		//System.out.println(optional.get());
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		else {
			System.out.println(optional.orElse("else part executing"));
		}
		
	}
}
