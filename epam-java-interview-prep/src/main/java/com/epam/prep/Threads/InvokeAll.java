package com.epam.prep.Threads;

import java.util.List;
import java.util.concurrent.*;

public class InvokeAll {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> task1 = () -> 10;
        Callable<Integer> task2 = () -> 20;
        Callable<Integer> task3 = () -> 30;

        List<Callable<Integer>> tasks =
                List.of(task1, task2, task3);

        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<Integer>>results = executor.invokeAll(tasks);

        for (Future<Integer> future : results) {
            System.out.println(future.get());
        }


        Callable<String> server1 =
                () -> callServer1();

        Callable<String> server2 =
                () -> callServer2();

        Callable<String> server3 =
                () -> callServer3();

        String result =
                executor.invokeAny(
                        List.of(server1, server2, server3)
                );

        System.out.println(result);
    }

    private static String callServer1() {
        return "Hi";
    }
    private static String callServer2() {
        return "H2";
    }
    private static String callServer3() {
        return "Hi3";
    }
}
