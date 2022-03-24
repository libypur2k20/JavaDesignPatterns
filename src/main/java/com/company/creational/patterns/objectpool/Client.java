package com.company.creational.patterns.objectpool;

import javafx.geometry.Point2D;

public class Client {

    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<Bitmap>(() -> new Bitmap("Logo.bmp"), 5);

    public static void main(String[] args){

        Bitmap bmp1 = bitmapPool.get();
        bmp1.setLocation(new Point2D(10,10));
        Bitmap bmp2 = bitmapPool.get();
        bmp2.setLocation(new Point2D(10,-10));

        bmp1.draw();
        bmp2.draw();

        bitmapPool.release(bmp1);
        bitmapPool.release(bmp2);
    }
}
