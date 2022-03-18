package com.company.creational.patterns.factory.method;

import com.company.creational.patterns.factory.method.message.Message;
import com.company.creational.patterns.factory.method.message.TextMessage;

public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new TextMessage();
    }

}
