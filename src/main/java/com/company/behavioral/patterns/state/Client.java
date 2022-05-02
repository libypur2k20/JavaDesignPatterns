package com.company.behavioral.patterns.state;

public class Client {

    public static void main(String[] args){

        Order order = new Order("100");
        order.paymentSuccessful();
        order.dispatched();
        order.delivered();
        System.out.println("Charges: " + order.cancel());
        //order.cancel(); // Throws IllegalStateException because order has been already cancelled.
    }
}
