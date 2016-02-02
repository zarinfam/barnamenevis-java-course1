package org.barnamenevis.course.java;

/**
 * Created by Teacher3 on 2/2/2016.
 */
public class Time {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59


    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 ||
                second < 0 || second >= 60){

            throw new IllegalArgumentException(
                    "hour, minute and/or second was out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    @Override
    public String toString() {
        return hour+":"+minute+":"+second;
    }
}
