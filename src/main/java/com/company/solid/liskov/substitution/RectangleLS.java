package com.company.solid.liskov.substitution;

public class RectangleLS implements Shape {

    private int height;
    private int width;

    public RectangleLS(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int computeArea(){
        return getWidth() * getHeight();
    }
}
