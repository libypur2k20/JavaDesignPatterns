package com.company.solid.liskov.substitution;

public class SquareLS implements Shape {


    private int side;

    public SquareLS(int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    private void setSide(int side){
        this.side = side;
    }

    @Override
    public int computeArea() {
        return side * side;
    }
}
