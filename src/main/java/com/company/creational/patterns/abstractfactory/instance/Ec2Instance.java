package com.company.creational.patterns.abstractfactory.instance;

import com.company.creational.patterns.abstractfactory.storage.Storage;

// Represents a concrete product in a family "Amazon Web Services"
public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity capatity){
        System.out.println("Created Ec2 Instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Ec2Instance");
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance started");
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped");
    }

    @Override
    public String toString() {
        return "Ec2Instance";
    }
}
