package org.barnamenevis.course.java;

/**
 * Created by Teacher3 on 2/2/2016.
 */
public class Stack {

    private int[] elements;
    private int stackSize = 0;

    public Stack(int size) {
        elements = new int[size];
    }

    public void push(int... element) {
        if (elements.length > stackSize) {
            elements[stackSize] = element;
            stackSize++;
        }
    }

    public int pop() {
        if (stackSize > 0) {
            stackSize--;
            return elements[stackSize];
        } else {
            return 10000;
        }
    }

    public int size(){
        return stackSize;
    }

    @Override
    public String toString() {

        String ret = "";

        for (int i = stackSize -1; i > 0; i--){
            ret += elements[i]+"\n";
        }

        if (stackSize > 0){
            ret += elements[0]+"\n----";
        }

        return ret;
    }
}
