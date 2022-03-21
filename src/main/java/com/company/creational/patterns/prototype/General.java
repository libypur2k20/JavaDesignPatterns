package com.company.creational.patterns.prototype;

public class General extends GameUnit {

    private String state = "idle";

    public void boostMorale(){
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General " + state + " @ " + getPosition();
    }

    /**
     * General is unique, so it does not allow cloning.
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("General is unique.");
    }

    /**
     * You cannot reset the general state.
     */
    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported.");
    }


}
