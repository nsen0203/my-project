package com.revision.java8.streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombineMultipleList {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> list1 = Arrays.asList(1, 2, 3);
//        List<Integer> list2 = Arrays.asList(4, 5, 6);
//        List<Integer> list3 = Arrays.asList(7, 8, 9);
//
//        // Combine multiple lists into a single list using Stream API
//        List<Integer> mergedList = Stream.of(list1, list2, list3) // Create a Stream of lists
//                                         .flatMap(List::stream)  // Flatten the stream of lists into a single stream
//                                         .collect(Collectors.toList()); // Collect the elements into a single list
//
//        // Output the merged list
//        System.out.println(mergedList);
		
		List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));
		
		System.out.println(list.stream().flatMap(List::stream).collect(Collectors.toList()));;

	}

}
