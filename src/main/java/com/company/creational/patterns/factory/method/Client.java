package com.company.creational.patterns.factory.method;

public class Client {

    public static void main(String[] args){
        // Using creator to create a product, choice of creator determines
        // the type of product created.
        printMessage(new JSONMessageCreator());
        // Using another creator to create another product.
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator){
        System.out.println(creator.getMessage().getContent());
    }

}
