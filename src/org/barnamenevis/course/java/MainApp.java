package org.barnamenevis.course.java;


import javax.swing.*;

/**
 * Created by Teacher3 on 1/12/2016.
 */
public class MainApp {

    public static void main(String[] args) {

        Stack stack = new Stack(20);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(1);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        stack.push(10);
        System.out.println(stack);

    }

}
