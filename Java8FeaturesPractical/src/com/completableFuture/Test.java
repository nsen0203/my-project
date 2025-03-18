package com.completableFuture;

import java.util.concurrent.CompletableFuture;

public class Test {
	
	public static void main(String[] args) {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(()-> {
			
			return "Hello World";
		});
		
		future.thenAccept(result -> System.out.println(result));
	}

}
