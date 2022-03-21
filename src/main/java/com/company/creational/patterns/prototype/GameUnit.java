package com.company.creational.patterns.prototype;

import javafx.geometry.Point3D;

/**
 * This class represents an abstract prototype and defines the Clone method.
 */
public abstract class GameUnit implements Cloneable{

    private Point3D position;

    public Point3D getPosition(){
        return position;
    }

    public GameUnit(){
        this.position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z) {
        this.position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance){
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit)super.clone();
        unit.initialize();
        return unit;
    }

    // Initialization of base class cloned object.
    protected void initialize(){
        this.position = Point3D.ZERO;
        reset();
    }

    //Allows subclasses to set it's initial state.
    protected abstract void reset();

}
