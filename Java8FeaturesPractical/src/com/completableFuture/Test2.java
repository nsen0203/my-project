package com.completableFuture;

import java.util.concurrent.CompletableFuture;

public class Test2 {
	
	public static void main(String [] args) {
		
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
			return "Future1";
		});
		
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			return "Future2";
		});
		
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
			return "Future3";
		});
		
		CompletableFuture<Void> allOf = CompletableFuture.allOf(future1, future2, future3);
		
		allOf.thenRun(() -> {
			String s1 = future1.join();
			String s2 = future2.join();
			String s3 = future3.join();
			System.out.println(s1 + " " + s1 + " " + s3);
		});
	}

}
