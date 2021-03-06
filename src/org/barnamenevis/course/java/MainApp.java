package org.barnamenevis.course.java;


import javax.swing.*;
import java.util.ArrayList;

import static java.lang.Math.*;

/**
 * Created by Teacher3 on 1/12/2016.
 */
public class MainApp {

    public static final int GREEN = 0;
    public static final int RED = 1;
    public static final int BLUE = 2;
    public static final int YELLOW = 3;

    public static void main(String[] args) {


        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        printArray(integerArray);
        printArray(characterArray);


//        String selectedColor = String.valueOf(JOptionPane.showInputDialog("Enter your favorite color :"));

//        String message = Colors.valueOf(selectedColor).getName();

//        switch (selectedColor){
//            case GREEN : message = "سبر"; break;
//            case RED : message = "قرمز"; break;
//            case BLUE : message = "آبی"; break;
//            case YELLOW : message = "زرد"; break;
//            default: message = "incorrect color";
//        }

//        JOptionPane.showMessageDialog(null, message);

//        Stack<Integer> stack = new Stack(20);
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//        stack.push(1);
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);
//
//        stack.push(10);
//        System.out.println(stack);

    }

    public static  <T> void printArray(T[] array){
        for (T t : array){
            System.out.println(t.toString());
        }
    }

}
