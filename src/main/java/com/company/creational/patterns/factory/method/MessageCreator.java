package com.company.creational.patterns.factory.method;

import com.company.creational.patterns.factory.method.message.Message;

/**
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented
 * by its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage(){
        Message msg = this.createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    //Factory method.
    public abstract Message createMessage();

}
