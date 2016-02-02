package org.barnamenevis.course.java;

/**
 * Created by Teacher3 on 1/26/2016.
 */
public class Student {

    private String name;
    private int average;
    public static int count;

    public Student(String name, int average) {
        this.name = name;

        if (average > 0.0 && average <= 100.0) {
            this.average = average;
        }
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(int average) {
        if (average > 0.0 && average <= 100.0) {
            this.average = average;
        }
    }

    public char getLetterGrade(){
        char letterGrade ;

        switch (average / 10){

            case 9:
            case 10:
                letterGrade = 'A';
                break;
            case 8:
                letterGrade = 'B';
                break;
            case 7:
                letterGrade = 'C';
                break;
            case 6:
                letterGrade = 'D';
                break;

            default:
                letterGrade = 'F';
        }

//        if (average >= 90.0)
//            letterGrade = 'A';
//        else if (average >= 80.0)
//            letterGrade = 'B';
//        else if (average >= 70.0)
//            letterGrade = 'C';
//        else if (average >= 60.0)
//            letterGrade = 'D';
//        else
//            letterGrade = 'F';

        return letterGrade;
    }
}
