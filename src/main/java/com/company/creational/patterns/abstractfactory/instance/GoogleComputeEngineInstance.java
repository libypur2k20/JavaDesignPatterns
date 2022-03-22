package com.company.creational.patterns.abstractfactory.instance;

import com.company.creational.patterns.abstractfactory.storage.Storage;

// Represents a concrete product in a family "Google Cloud Platform"
public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google Compute Engine Instance");
    }


    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Compute Engine Instance");
    }

    @Override
    public void start() {
        System.out.println("Compute Engine Instance started");
    }

    @Override
    public void stop() {
        System.out.println("Compute Engine Instance stopped");
    }

    @Override
    public String toString() {
        return "Google Compute Engine Instance";
    }

}
