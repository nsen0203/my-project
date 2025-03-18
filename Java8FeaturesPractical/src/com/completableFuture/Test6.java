package com.completableFuture;

import java.util.concurrent.*;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
		CompletableFuture<String> future2 = future1.thenComposeAsync(s -> CompletableFuture.supplyAsync(() -> s + "World"));
		
		future2.thenAccept(result -> System.out.println(result)).join();

	}

}
