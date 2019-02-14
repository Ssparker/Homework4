package edu.dmacc.codedsm.hw4;

import java.util.concurrent.atomic.AtomicInteger;

public class VariableAdder {
    public static final int AMAZON_SHAE_BUTTER = 10; //amazon product priced at $10 -instnace constant
    public static final int orderQuantity = 5; //order 5ea instance variable

    public static void main(String[] args) {
        int amazonOrder = AMAZON_SHAE_BUTTER * orderQuantity;
        int shipping = 2;   //   method variable
        int orderSubtotal = amazonOrder + shipping;
        double TAX_RATE = 1.06;
        double taxAmount = orderSubtotal * TAX_RATE;//  method variable
        double result = taxAmount;

        System.out.println("The sum is " +result);
    }
}
