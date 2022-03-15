package com.company.solid.liskov.substitution;

public class Square extends Rectangle {


    public Square(int side){
        super(side,side);
    }

    @Override
    public void setWidth(int width){
        this.setSide(width);
    }

    @Override
    public void setHeight(int height){
        this.setSide(height);
    }

    private void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }
}
