package com.company.structural.patterns.proxy.staticvirtual;

import javafx.geometry.Point2D;

// Interface implemented by proxy and concrete objects.
public interface Image {

    void setLocation(Point2D location);

    Point2D getLocation();

    void render();
}
