package com.company.behavioral.patterns.state;

public class Delivered implements OrderState{

    @Override
    public double handleCancellation() {

        System.out.println("Contacting courier service for ite pickup");
        System.out.println("Payment roll back will be initiated upon receiving returned item");
        return 30;
    }

    @Override
    public OrderState next() {
        return null;
    }

}
