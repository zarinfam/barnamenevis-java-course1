package org.barnamenevis.course.java;

/**
 * Created by Teacher3 on 1/19/2016.
 */
public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }

    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) // if the deposit
            balance += depositAmount; // a

    }
    // method returns the account balance
    public double getBalance()
    {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
