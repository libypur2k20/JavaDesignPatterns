package com.company.creational.patterns.abstractfactory;

import com.company.creational.patterns.abstractfactory.factory.AwsResourceFactory;
import com.company.creational.patterns.abstractfactory.factory.GoogleResourceFactory;
import com.company.creational.patterns.abstractfactory.factory.ResourceFactory;
import com.company.creational.patterns.abstractfactory.instance.Instance;
import com.company.creational.patterns.abstractfactory.storage.Storage;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory){
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib){
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.crateStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args){

        Client awsClient = new Client(new AwsResourceFactory());
        Instance awsInstance = awsClient.createServer(Instance.Capacity.small, 1500);
        awsInstance.start();
        awsInstance.stop();

        System.out.println("*********************************************************");

        Client gcpClient = new Client(new GoogleResourceFactory());
        Instance gcpInstance = gcpClient.createServer(Instance.Capacity.small, 1500);
        gcpInstance.start();
        gcpInstance.stop();
    }
}
