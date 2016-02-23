package org.barnamenevis.course.java.employee;

/**
 * Created by Teacher3 on 2/16/2016.
 */
public class Invoice implements Payable, FilePrintable,ConsolePrintable{
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity,
                   double pricePerItem) throws IllegalArgumentException{
        if (quantity < 0) // validate quantity
            throw new IllegalArgumentException("Quantity must be >= 0");

        if (pricePerItem < 0.0) // validate pricePerItem
            throw new IllegalArgumentException(
                    "Price per item must be >= 0");

        this.quantity = quantity;
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.pricePerItem = pricePerItem;
    } // end constructor

    // get price per item
    public double getCost() {
        return quantity * pricePerItem;
    }


    @Override
    public double getPaymentAmount() {
        return getCost();
    }

    @Override
    public void print(String message) {
        FilePrintable.super.print(message);
        ConsolePrintable.super.print(message);
    }
}
