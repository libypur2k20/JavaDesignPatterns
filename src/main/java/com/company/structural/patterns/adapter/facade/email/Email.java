package com.company.structural.patterns.adapter.facade.email;

public class Email {

    public static EmailBuilder getBuilder(){
        return new EmailBuilder();
    }
}
