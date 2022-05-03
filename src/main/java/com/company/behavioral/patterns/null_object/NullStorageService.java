package com.company.behavioral.patterns.null_object;

public class NullStorageService extends StorageService {

    @Override
    public void save(Report report) {
        System.out.println("Null object save method. Doing nothing!");
    }
}
