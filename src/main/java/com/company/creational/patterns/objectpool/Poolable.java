package com.company.creational.patterns.objectpool;

// Every class that implements this interface can be inserted
// in the pool.
public interface Poolable {

    // state reset
    void reset();
}
