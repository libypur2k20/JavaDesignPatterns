package com.company.creational.patterns.factory.method;

import com.company.creational.patterns.factory.method.message.JSONMessage;
import com.company.creational.patterns.factory.method.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }

}
