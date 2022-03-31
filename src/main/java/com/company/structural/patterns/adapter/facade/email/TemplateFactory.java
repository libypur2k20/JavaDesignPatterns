package com.company.structural.patterns.adapter.facade.email;

public class TemplateFactory {

    public static Template createTemplate(Template.TemplateType type){
        switch(type){
            case Email:
                return new OrderEmailTemplate();
            default:
                throw new IllegalArgumentException("Unknown TemplateType");
        }
    }
}
