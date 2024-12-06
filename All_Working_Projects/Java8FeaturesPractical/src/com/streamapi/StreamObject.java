package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stream API is used to process collection and also used to process group of objects
		
		//first way of creating stream
		Stream<Object> object = Stream.empty();
		//System.out.println(object);
		
		//Second way of creating object and work with collection and array
		
		String names[]= {"Ram", "Durgesh", "Uttam", "Raghav"};
		
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e -> {
			System.out.println(e);
		});
		
		
		//Third way of creating stream object with builder
		Stream<Object> build = Stream.builder().build();
		//System.out.println(build);
		
		//Fourth way of creating stream object with arrays
		
		Stream<String> streamString= Arrays.stream(new String[]{"Nikhil", "Srashti", "Renu"});
		streamString.forEach(e -> {System.out.println(e);});
		
		
		DoubleStream streamDouble = Arrays.stream(new double[]{10.78, 98.23, 32.43});
		streamDouble.forEach(e -> {
			System.out.println(e);
		});
		
		IntStream streamInt = Arrays.stream(new int[] {10,5,20,14});
		streamInt.forEach( e ->{
			System.out.println(e);
		});
		
		
		
		//Fivth way of creating stream object
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(20);
		list1.add(25);
		list1.add(15);
		list1.add(10);
		list1.add(33);
		list1.add(44);
		
		Stream<Integer> streamList= list1.stream();
		System.out.println("------------");
		streamList.forEach(e ->{
			System.out.println(e);
		});
		

	}

}
