package com.company.behavioral.patterns.state;

public class Cancelled implements OrderState{

    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Cancelled order. Can't cancel anymore");
    }

    @Override
    public OrderState next() {
        throw new UnsupportedOperationException("Cancel state has not a next one.");
    }

}
