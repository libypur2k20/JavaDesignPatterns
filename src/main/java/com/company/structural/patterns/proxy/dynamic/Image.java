package com.company.structural.patterns.proxy.dynamic;

import javafx.geometry.Point2D;

// Interface implemented by proxy and concrete objects.
public interface Image {

    Point2D getLocation();

    void setLocation(Point2D location);

    void render();
}
