package com.company.structural.patterns.facade.email;

public class OrderEmailTemplate extends Template {

    @Override
    public String format(Object obj) {
        return "TEMPLATE";
    }
}
