package com.company.behavioral.patterns.template_method;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private String id;
    private double total;
    private LocalDate date;
    private Map<String,Double> items = new HashMap<String,Double>();

    public Order(String id){
        this.id = id;
        this.date = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public LocalDate getDate() {
        return date;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public void addItem(String itemName, double itemPrice){
        items.put(itemName, itemPrice);
        total += itemPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", date=" + date +
                '}';
    }
}
