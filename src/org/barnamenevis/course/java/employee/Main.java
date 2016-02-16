package org.barnamenevis.course.java.employee;

import java.util.ArrayList;

/**
 * Created by Teacher3 on 2/9/2016.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Payable> list = new ArrayList<>();

        list.add(new CommissionEmployee(
                "Ali", "Ahmadi", "123456789" , 2000000, 0.1 //200
        ));


        list.add( new BasePlusCommissionEmployee(
                "Hasan", "Hassani", "123456789" , 2000000, 0.05 , 500000 //600
        ));


        list.add(new Invoice("Table", "Table", 10, 200000));//2000
        list.add(new Invoice("Chair", "Chair", 10, 50000));//500


        double totalCosts = 0;

        for (Payable payable : list){
            totalCosts += payable.getPaymentAmount();
        }


        System.out.println("total costs = "+(totalCosts));

    }
}
