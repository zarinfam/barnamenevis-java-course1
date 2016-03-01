package org.barnamenevis.course.java.collection;

import java.util.*;

/**
 * Created by Teacher3 on 3/1/2016.
 */
public class MainCollection {

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(
                new Apple(Colors.GREEN, 120)
                ,new Apple(Colors.RED , 110)
                ,new Apple(Colors.RED , 100)
                ,new Apple(Colors.YELLOW , 111)
                ,new Apple(Colors.GREEN , 113)
                ,new Apple(Colors.GREEN , 116)
                ,new Apple(Colors.RED , 108)

        );


        Map<Colors , List<Apple>> map = new HashMap<>();




    }

}
