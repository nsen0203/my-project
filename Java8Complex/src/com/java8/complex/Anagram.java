package com.java8.complex;

import java.util.stream.*;
import java.util.*;

public class Anagram {
	
	public static void main(String[] args) {
		String s1="RaceCar";
		String s2="CarRace";
		
		List<String> st=Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.toList());
		List<String> st1=Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.toList());
		
		if(st.equals(st1)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not a Anagram");
		}
	}

}
