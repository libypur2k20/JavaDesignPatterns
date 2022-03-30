package com.company.structural.patterns.decorator;

public class TextMessage implements Message{

    private String msg;

    public TextMessage(String message){
        this.msg = message;
    }

    @Override
    public String getContent() {
        return msg;
    }
}
