package com.company.structural.patterns.proxy.dynamic;

import javafx.geometry.Point2D;

public class BitmapImage implements Image {

    private Point2D location;
    private String name;

    public BitmapImage(String name){
        // Loads image from file on disk
        System.out.println("Loaded from disk: " + name);
        this.name = name;
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void render() {
        // renders to screen
        System.out.println("Rendered " + this.name);
    }
}
