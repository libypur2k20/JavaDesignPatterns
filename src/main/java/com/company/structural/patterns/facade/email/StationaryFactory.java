package com.company.structural.patterns.facade.email;

public class StationaryFactory {

    public static Stationary createStationary(){
        return new HalloweenStationary();
    }
}
