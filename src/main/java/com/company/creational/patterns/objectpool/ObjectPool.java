package com.company.creational.patterns.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ObjectPool<T extends Poolable> {

    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count){
        availablePool = new LinkedBlockingQueue<T>();
        IntStream.range(0, count).forEach(i -> availablePool.offer(creator.get()));
    }

    public T get(){
        try{
            return availablePool.take();
        }
        catch(InterruptedException e){
            System.err.println("take() interrupted waiting on pooled queue");
        }
        return null;
    }

    public void release(T obj){
        obj.reset();
        try{
            availablePool.put(obj);
        }
        catch(InterruptedException e){
            System.err.println("put() interrupted waiting on pooled queue");
        }
    }
}
