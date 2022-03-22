package com.company.creational.patterns.abstractfactory.factory;

import com.company.creational.patterns.abstractfactory.instance.Ec2Instance;
import com.company.creational.patterns.abstractfactory.instance.GoogleComputeEngineInstance;
import com.company.creational.patterns.abstractfactory.instance.Instance;
import com.company.creational.patterns.abstractfactory.storage.GoogleCloudStorage;
import com.company.creational.patterns.abstractfactory.storage.Storage;

//Factory implementation for Google Cloud Platform resources.
public class GoogleResourceFactory implements ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage crateStorage(int capacityInMib) {
        return new GoogleCloudStorage(capacityInMib);
    }
}
