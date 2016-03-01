package org.barnamenevis.course.java.collection;

import java.util.*;
import java.util.stream.Collectors;


/**
 * Created by Teacher3 on 3/1/2016.
 */
public class MainCollection {

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(
                new Apple(Colors.GREEN, 120)
                , new Apple(Colors.RED, 110)
                , new Apple(Colors.RED, 100)
                , new Apple(Colors.YELLOW, 111)
                , new Apple(Colors.GREEN, 113)
                , new Apple(Colors.GREEN, 116)
                , new Apple(Colors.RED, 108)
        );


        Optional<Integer> sum = list.stream()
                .filter(a -> a.getColor() == Colors.RED)
                .map(a -> a.getWeight())
                .reduce(Integer::sum);

        System.out.println(sum.orElse(-1));

//        Map<Colors, List<Apple>> map = new HashMap<>();
//
//
//        List<Apple> greenApple = new ArrayList<>();
//        List<Apple> redApple = new ArrayList<>();
//        List<Apple> yellowApple = new ArrayList<>();
//
//        for (Apple a : list) {
//            if (a.getColor() == Colors.GREEN) {
//                greenApple.add(a);
//            } else if (a.getColor() == Colors.RED) {
//                redApple.add(a);
//            }else if (a.getColor() == Colors.YELLOW) {
//                yellowApple.add(a);
//            }
//        }
//
//        map.put(Colors.GREEN , greenApple);
//        map.put(Colors.RED , redApple);
//        map.put(Colors.YELLOW , yellowApple);
//
//        System.out.println(map.get(Colors.GREEN));

    }

}
