package com.company.creational.patterns.factory.method.message;

public class TextMessage extends Message{

    @Override
    public String getContent() {
        return "Text";
    }

}
