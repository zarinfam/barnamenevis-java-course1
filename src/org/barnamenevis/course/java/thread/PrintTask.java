package org.barnamenevis.course.java.thread;

import java.security.SecureRandom;

/**
 * Created by Teacher3 on 3/8/2016.
 */
public class PrintTask implements Runnable {

    public static int counter=0;
    private String name;
    private int duration;

    public PrintTask(String name) {
        this.name = name;
        duration = new SecureRandom().nextInt(5000);
    }

    @Override
    public void run() {


        System.out.printf("%s doing task for %d milliseconds.%n",
                name, duration);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("%s finish %n", duration);
    }
}
