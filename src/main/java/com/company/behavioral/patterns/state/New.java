package com.company.behavioral.patterns.state;

public class New implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("It's a new Order. No processing done");
        return 0;
    }

    @Override
    public OrderState next() {
        return new Paid();
    }
}
