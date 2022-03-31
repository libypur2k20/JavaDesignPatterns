package com.company.structural.patterns.adapter.facade.email;

import com.company.structural.patterns.adapter.facade.Order;

// Facade provides simple methods for client to use.
public class EmailFacade {

    public boolean sendOrderEmail(Order order){
        Template template = TemplateFactory.createTemplate(Template.TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withStationary(stationary)
                .withTemplate(template)
                .forObject(order)
                .build();

        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);
    }

}
