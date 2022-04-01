package com.company.structural.patterns.proxy;

import javafx.geometry.Point2D;

public class BitmapImage implements Image {

    private Point2D location;
    private String name;

    public BitmapImage(String fileName) {
        // Loads image from file on disk.
        System.out.println("Loaded from disk: " + fileName);
        this.name = fileName;
    }


    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void render() {
        // Renders to screen
        System.out.println("Rendered " + this.name);
    }
}
