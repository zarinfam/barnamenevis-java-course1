package org.barnamenevis.course.java;

/**
 * Created by Teacher3 on 1/19/2016.
 */
public class Car {

    private int gear ;
    public boolean running ;

    public void run(){
        if (gear != 0){
            running = true;

            System.out.println("car is running");
        }else{
            System.out.println("car is not running");
        }
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        if (this.gear + 1 == gear) {
            this.gear = gear;
        }else{
            System.out.println("change gear is not allowed");
        }
    }
}
