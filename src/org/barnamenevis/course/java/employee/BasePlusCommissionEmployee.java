package org.barnamenevis.course.java.employee;

/**
 * Created by Teacher3 on 2/9/2016.
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double base;

    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double base) {

        super(firstName, lastName,
                socialSecurityNumber, grossSales, commissionRate);


        checkBaseValidity(base);

        this.base = base;
    }

    @Override
    public double earnings() {
        return base + super.earnings();
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee";
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        checkBaseValidity(base);

        this.base = base;
    }

    private void checkBaseValidity(double base) {
        if (base < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
    }
}