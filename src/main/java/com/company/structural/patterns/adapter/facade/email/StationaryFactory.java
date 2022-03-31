package com.company.structural.patterns.adapter.facade.email;

public class StationaryFactory {

    public static Stationary createStationary(){
        return new HalloweenStationary();
    }
}
