package com.company.behavioral.patterns.state;

public interface OrderState {

    double handleCancellation();

    OrderState next();
}
