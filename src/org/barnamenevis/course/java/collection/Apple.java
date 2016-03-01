package org.barnamenevis.course.java.collection;

import org.barnamenevis.course.java.*;

/**
 * Created by Teacher3 on 3/1/2016.
 */
public class Apple {
    private Colors color;
    private float weight;

    public Apple(Colors color, float weight) {
        this.color = color;
        this.weight = weight;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return color.name() + ":" + weight;
    }
}
