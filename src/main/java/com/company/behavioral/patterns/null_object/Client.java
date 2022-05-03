package com.company.behavioral.patterns.null_object;

public class Client {

    public static void main(String[] args){
        // Real storage service.
        //ComplexService service = new ComplexService("Simple report", new StorageService());
        // Null Object storage service.
        ComplexService service = new ComplexService("Simple report", new NullStorageService());
        service.generateReport();
    }
}
