package com.company.behavioral.patterns.state;

// Context class
public class Order {

    private final String id;
    private OrderState currentState;

    public Order(String id){
        this.id = id;
        this.currentState = new New();
    }

    public double cancel(){
        double charges = currentState.handleCancellation();
        currentState = new Cancelled();
        return charges;
    }

    private void processStateChanged(){
        this.currentState = currentState.next();
    }

    public void paymentSuccessful(){
        processStateChanged();
        //currentState = new Paid();
    }

    public void dispatched(){
        processStateChanged();
        //currentState = new InTransit();
    }

    public void delivered(){
        processStateChanged();
        //currentState = new Delivered();
    }
}
