package com.company.structural.patterns.proxy.staticvirtual;

import javafx.geometry.Point2D;

// Proxy class.
public class ImageProxy implements Image{

    private String name;
    private Point2D location;

    private BitmapImage image;

    public ImageProxy(String name){
        this.name = name;
    }

    @Override
    public void setLocation(Point2D location) {
        if (image != null){
            image.setLocation(location);
        }
        else{
            this.location = location;
        }
    }

    @Override
    public Point2D getLocation() {
        if (image != null){
            return image.getLocation();
        }
        else{
            return this.location;
        }
    }

    @Override
    public void render() {
        if (location != null){
            if (image == null){
                image = new BitmapImage(name);
            }
            image.setLocation(location);
            image.render();
        }
        else{
            throw new NullPointerException("Image location cannot be null.");
        }
    }
}
