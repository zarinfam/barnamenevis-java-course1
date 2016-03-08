package org.barnamenevis.course.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Teacher3 on 3/8/2016.
 */
public class MainThread {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        PrintTask task1 = new PrintTask("task1");
        PrintTask task2 = new PrintTask("task2");
        PrintTask task3 = new PrintTask("task3");
        PrintTask task4 = new PrintTask("task4");
        PrintTask task5 = new PrintTask("task5");

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(task1); // start task1
        executorService.execute(task2); // start task1
        executorService.execute(task3); // start task1
        executorService.execute(task4); // start task1
        executorService.execute(task5); // start task1

        executorService.shutdown();

        while (!executorService.isTerminated()){

        }

        System.out.println("total time = "+(System.currentTimeMillis() - startTime)/1000);
    }
}
