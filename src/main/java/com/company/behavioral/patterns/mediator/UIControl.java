package com.company.behavioral.patterns.mediator;

// Abstract colleague.
public interface UIControl {

    void controlChanged(UIControl control);

    String getControlName();

    String getControlValue();
}
