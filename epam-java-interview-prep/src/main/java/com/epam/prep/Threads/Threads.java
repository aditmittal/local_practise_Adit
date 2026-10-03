package com.epam.prep.Threads;

import java.util.concurrent.*;

public class Threads {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Runnable task = () ->{
            System.out.println("Hello");
        };
        for(int i=0;i<10;i++) {
            if(i==5){
                executor.shutdownNow();
            }
            executor.execute(task);
            System.out.println("i = "+i+" "+Thread.currentThread().getName());
        }
        Callable<Integer> task2 = () ->{
            return 1+20;
        };

        for(int i=0;i<10;i++) {
            Future<Integer> future = executor.submit(task2);
            System.out.println(future.get());
            System.out.println("I = "+i+" "+Thread.currentThread().getName());
            if(i==5){
                executor.shutdownNow();
            }
        }
        executor.shutdown();
    }
}
