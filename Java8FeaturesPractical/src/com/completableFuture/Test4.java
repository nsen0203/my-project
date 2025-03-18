package com.completableFuture;

import java.util.concurrent.CompletableFuture;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
			return 10;
		});
		
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
			int result = 10/0;
			return result;
		});
		
		CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> {
			return 20;
		});
		
		CompletableFuture<Void> allOf = CompletableFuture.allOf(future1, future2, future3);

		allOf.exceptionally(ex -> {
			System.out.println("Exception is "+ ex.getMessage());
			return null;
		}).thenRun(() ->{
			int join = future1.join();
			int join2 = future2.join();
			int join3 = future3.join();
			System.out.println(join + " "+ join2+ " "+ join3);
		}); 
		
	}

}
