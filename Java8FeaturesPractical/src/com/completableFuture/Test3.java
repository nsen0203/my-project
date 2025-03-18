package com.completableFuture;

import java.util.concurrent.CompletableFuture;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() ->{
			int result =10/0;
			return result;
		});
		
		future.exceptionally(ex -> {
			System.out.println("Exception is " + ex.getMessage());
			return 0;
		}).thenAccept(result -> System.out.println(result));
	}

}
