package org.example.examples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // This code block will run asynchronously in a separate thread
            return "Hello, world!";
        });

// The thenAccept method will run when the CompletableFuture is completed with a result
        future.thenAccept(result -> {
            System.out.println(result); // Prints "Hello, world!"
        });

// The get method will block until the CompletableFuture is completed and return the result
        String result = future.get(); // Returns "Hello, world!"

    }
}
