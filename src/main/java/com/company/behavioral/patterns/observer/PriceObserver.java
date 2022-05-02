package com.company.behavioral.patterns.observer;

public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {

        double total = order.getItemPrice();

        if (total >= 500){
            order.setDiscount(20);
        }
        if(total >= 200) {
            order.setDiscount(10);
        }

    }
}
