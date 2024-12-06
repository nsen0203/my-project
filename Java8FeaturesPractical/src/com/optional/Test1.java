package com.optional;

import java.util.Optional;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Tinku";
		Optional<String> opt = Optional.ofNullable(s);
		
		System.out.println(opt.isPresent());
		
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		else {
			System.out.println("Else part running");
		}

	}

}
