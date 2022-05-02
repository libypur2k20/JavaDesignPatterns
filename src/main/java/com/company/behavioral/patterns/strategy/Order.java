package com.company.behavioral.patterns.strategy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private final String id;

    private final LocalDate date;

    private double total;

    private Map<String,Double> items = new HashMap<String,Double>();

    public Order(String id){
        this.id = id;
        this.date = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public double getTotal(){
        return total;
    }

    public void addItem(String name, double price){
        items.put(name,price);
        total += price;
    }


}
