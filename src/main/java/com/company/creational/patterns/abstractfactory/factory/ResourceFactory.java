package com.company.creational.patterns.abstractfactory.factory;

import com.company.creational.patterns.abstractfactory.instance.Instance;
import com.company.creational.patterns.abstractfactory.storage.Storage;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);
    Storage crateStorage(int capacityInMib);
}
