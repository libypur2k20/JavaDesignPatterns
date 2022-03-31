package com.company.structural.patterns.adapter.facade;

import com.company.structural.patterns.adapter.facade.email.EmailFacade;
import com.company.structural.patterns.facade.email.*;

public class Client {

    public static void main(String[] args){

        Order order = new Order("101",99.99);
        EmailFacade facade = new EmailFacade();

//        boolean result = sendOrderEmailWithoutFacade(order);
        boolean result = facade.sendOrderEmail(order);

        System.out.println("Order Email " + (result ? "sent!" : "NOT sent..."));
    }

//    private static boolean sendOrderEmailWithoutFacade(Order order){
//        Template template = TemplateFactory.createTemplate(Template.TemplateType.Email);
//        Stationary stationary = StationaryFactory.createStationary();
//        Email email = Email.getBuilder()
//                .withStationary(stationary)
//                .withTemplate(template)
//                .forObject(order)
//                .build();
//
//        Mailer mailer = Mailer.getMailer();
//        return mailer.send(email);
//    }
}
