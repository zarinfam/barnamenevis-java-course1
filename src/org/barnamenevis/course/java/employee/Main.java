package org.barnamenevis.course.java.employee;

import java.util.ArrayList;

/**
 * Created by Teacher3 on 2/9/2016.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new CommissionEmployee(
                "Ali", "Ahmadi", "123456789" , 2000000, 0.1
        ));


        list.add( new BasePlusCommissionEmployee(
                "Hasan", "Hassani", "123456789" , 2000000, 0.05 , 500000
        ));

        if (list.get(0) instanceof CommissionEmployee){
            CommissionEmployee commissionEmployee = (CommissionEmployee)list.get(0);
            System.out.println(commissionEmployee.getCommissionRate());
        }


        for (Employee employee : list){
            System.out.println(employee.earnings());
        }

    }
}
