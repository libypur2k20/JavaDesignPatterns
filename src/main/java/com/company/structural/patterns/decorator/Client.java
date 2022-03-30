package com.company.structural.patterns.decorator;

public class Client {

    public static void main(String[] args){

        Message msg = new TextMessage("The <FORCE> is strong with this one!");
        System.out.println(msg.getContent());

        //HTML Encoder Decorator.
        Message htmlMsg = new HtmlEncodedMessage(msg);
        System.out.println(htmlMsg.getContent());

        // Base64 Encoder Decorator.
        Message base64Msg = new Base64EncodedMessage(msg);
        System.out.println(base64Msg.getContent());

        // Recursive Composition
        Message recursiveDecorator = new Base64EncodedMessage(htmlMsg);
        System.out.println(recursiveDecorator.getContent());

    }
}
