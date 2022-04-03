package com.company.structural.patterns.proxy.dynamic;

import javafx.geometry.Point2D;

public class Client {

    public static void main(String[] args){

        Image image = ImageFactory.getImage("Image1.bmp");
        image.setLocation(new Point2D(-10,10));
        System.out.println(image.getLocation());

        System.out.println("****************************************");

        image.render();
    }
}
