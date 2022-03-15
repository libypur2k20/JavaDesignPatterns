package com.company.solid.dependency.inversion;

public class TextFormatter implements Formatter{
    @Override
    public String format(Message message) throws FormatException {
        return message.getTimestamp() + ":" + message.getMsg();
    }
}
