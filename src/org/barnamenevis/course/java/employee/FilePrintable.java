package org.barnamenevis.course.java.employee;

/**
 * Created by Teacher3 on 2/16/2016.
 */
public interface FilePrintable extends Printable {
    default void print(String message){
        System.out.println("print in file");
    }
}
