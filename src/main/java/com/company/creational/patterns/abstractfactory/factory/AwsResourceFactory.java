package com.company.creational.patterns.abstractfactory.factory;

import com.company.creational.patterns.abstractfactory.instance.Ec2Instance;
import com.company.creational.patterns.abstractfactory.instance.Instance;
import com.company.creational.patterns.abstractfactory.storage.S3Storage;
import com.company.creational.patterns.abstractfactory.storage.Storage;

//Factory implementation for Amazon Web Services resources.
public class AwsResourceFactory implements ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage crateStorage(int capacityInMib) {
        return new S3Storage(capacityInMib);
    }
}
