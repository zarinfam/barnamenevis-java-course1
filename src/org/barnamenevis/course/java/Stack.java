package org.barnamenevis.course.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Teacher3 on 2/2/2016.
 */
public class Stack<T> {

    private List<T> elements;
    private int stackSize = 0;

    public Stack(int size) {
        elements = new ArrayList<>(size);
    }

    public void push(T element) {
        if (elements.size() > stackSize) {
            elements.add(element);
            stackSize++;
        }
    }

    public T pop() {
        if (stackSize > 0) {
            stackSize--;
            return elements.get(stackSize);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size(){
        return stackSize;
    }


}
