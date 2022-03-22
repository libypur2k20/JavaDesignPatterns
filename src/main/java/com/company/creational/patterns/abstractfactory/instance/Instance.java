package com.company.creational.patterns.abstractfactory.instance;

import com.company.creational.patterns.abstractfactory.storage.Storage;

// Represents an abstract product.
public interface Instance {

    enum Capacity {micro, small, large}

    void attachStorage(Storage storage);
    void start();
    void stop();

}
