package com.completableFuture;

import java.util.concurrent.*;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompletableFuture<Void> future = CompletableFuture.runAsync(() ->{
			System.out.println("Inside run async call");
		});
		
		future.thenAccept(result -> System.out.println(result));

	}

}
