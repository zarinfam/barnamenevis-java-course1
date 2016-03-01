package org.barnamenevis.course.java.lambda;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Teacher3 on 2/23/2016.
 */
public class LambdaMain {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ali", "Marjan", "Naghi", "Ahmad", "Arezo");

        System.out.println(filterByFirstChar(list, s -> s.startsWith("A")));


    }

    public static List<String> filterByFirstChar(List<String> list, Function<String, Boolean> predicate){
        List<String> filteredList = new ArrayList<>();

        for (String name: list){
            if (predicate.apply(name)){
                filteredList.add(name);
            }
        }

        return filteredList;
    }

}
