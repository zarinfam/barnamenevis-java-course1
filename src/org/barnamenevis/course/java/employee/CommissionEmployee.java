package org.barnamenevis.course.java.employee;

/**
 * Created by Teacher3 on 2/9/2016.
 */
public class CommissionEmployee extends Employee{


    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber, double grossSales,
                              double commissionRate) {

        super(firstName, lastName, socialSecurityNumber);

        // if grossSales is invalid throw exception
        checkGrossSalesValidity(grossSales);

        // if commissionRate is invalid throw exception
        checkCommisionRateValidity(commissionRate);

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // end constructor

    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return "CommissionEmployee";
    }

    private void checkCommisionRateValidity(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
    }

    private void checkGrossSalesValidity(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
    }



    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        checkGrossSalesValidity(grossSales);
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        checkCommisionRateValidity(commissionRate);

        this.commissionRate = commissionRate;
    }
}
