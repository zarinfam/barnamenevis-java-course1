package org.barnamenevis.course.java.lambda;

import java.io.File;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Teacher3 on 2/23/2016.
 */
public class LambdaMain {

    public static void main(String[] args) {


        Predicate<String> predicate = s -> s.length() > 5;

        System.out.println(predicate.test("ahmad"));
        System.out.println(predicate.test("mohammad"));

        Function<Integer, Integer> power = x -> x*2;

        System.out.println(power.apply(10));

//
//        File folder = new File("files");
//
//        String[] files = folder.list((dir, name) -> Character.isDigit(name.charAt(0)));
//
//        for (String fileName : files) {
//            System.out.println(fileName);
//        }
    }

    public static int[] convert(int[] inputArray, Function<Integer, Integer> f ){

        int[] retArray = new int[inputArray.length];

        int counter = 0;
        for (int number : inputArray) {
            retArray[counter] = f.apply(inputArray[counter]);
            counter++;
        }

        return retArray;
    }
}
