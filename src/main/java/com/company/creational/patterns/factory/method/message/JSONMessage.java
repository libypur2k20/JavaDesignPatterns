package com.company.creational.patterns.factory.method.message;

public class JSONMessage extends Message{

    @Override
    public String getContent() {
        return "{\"JSON\":[]}";
    }

}
