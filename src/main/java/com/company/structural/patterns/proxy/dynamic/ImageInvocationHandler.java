package com.company.structural.patterns.proxy.dynamic;

import javafx.geometry.Point2D;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Implement invocation handler. Your "proxy" code goes here.
public class ImageInvocationHandler implements InvocationHandler {

    private String filename;
    private Point2D location;
    private BitmapImage image;

    private static final Method setLocationMethod;
    private static final Method getLocationMethod;
    private static final Method renderMethod;

    // Cache methods for later comparison.
    static{
        try {
            setLocationMethod = Image.class.getMethod("setLocation", new Class[]{Point2D.class});
            getLocationMethod = Image.class.getMethod("getLocation", null);
            renderMethod = Image.class.getMethod("render", null);
        }
        catch(NoSuchMethodException e){
            throw new NoSuchMethodError(e.getMessage());
        }
    }

    public ImageInvocationHandler(String filename){
        this.filename = filename;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.equals(setLocationMethod)) {
            return handleSetLocation((Point2D)args[0]);
        } else if (method.equals(getLocationMethod)) {
            return handleGetLocation();
        } else if (method.equals(renderMethod)) {
            return handleRender();
        }

        return null;
    }

    private Object handleRender(){
        if (this.location != null){
            if (this.image == null){
                image = new BitmapImage(this.filename);
            }
            image.setLocation(this.location);
            image.render();
            return null;
        }
        else{
            throw new NullPointerException("Image location cannot be null.");
        }
    }

    private Object handleGetLocation(){
        return this.location;
    }

    private Object handleSetLocation(Point2D location){
        this.location = location;
        return null;
    }
}
