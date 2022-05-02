package com.company.behavioral.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String orderId;

    private int itemCount;

    private double itemPrice;

    private double discount;

    private double shippingCost;

    private List<OrderObserver> observers = new ArrayList<>();

    public void attach(OrderObserver observer){
        observers.add(observer);
    }

    public void detach(OrderObserver observer){
        observers.remove(observer);
    }

    public Order(String orderId){
        this.orderId = orderId;
    }

    public int getItemCount(){
        return itemCount;
    }

    public double getItemPrice(){
        return ((itemPrice - getDiscount()) + getShippingCost());
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void addItem(double price){
        this.itemCount++;
        this.itemPrice += price;

        observers.forEach(ob -> ob.updated(this));
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", itemCount=" + itemCount +
                ", itemPrice=" + itemPrice +
                ", discount=" + discount +
                ", shippingCost=" + shippingCost +
                "}";
    }
}
