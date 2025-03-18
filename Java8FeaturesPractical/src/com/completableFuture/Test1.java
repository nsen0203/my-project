package com.completableFuture;

import java.util.concurrent.*;

public class Test1 {
	
	public static void main(String [] args) {
		
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10)
				.thenApplyAsync(i -> i*5)
				.thenApplyAsync(i -> i+5);
		future.thenAccept(r->System.out.println(r));
		
	}

}
