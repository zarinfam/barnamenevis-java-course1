package org.barnamenevis.course.java;

/**
 * Created by Teacher3 on 2/2/2016.
 */
public enum  Colors {
    GREEN("سبر"), RED("قرمز")
    ;

    private String name;

    Colors(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
