package com.company.creational.patterns.prototype;

public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack(){
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman " + state + " @ " + getPosition();
    }

    @Override
    protected void reset() {
        this.state = "idle";
    }
}
