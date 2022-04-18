package com.company.behavioral.patterns.mediator;

public class Label extends javafx.scene.control.Label implements UIControl{

    private UIMediator mediator;

    public Label(UIMediator mediator){
        this.mediator = mediator;
        this.setMinWidth(100);
        this.setText("Label");
        this.mediator.register(this);

    }

    @Override
    public void controlChanged(UIControl control) {
        this.setText(control.getControlValue());
    }

    @Override
    public String getControlName() {
        return this.getText();
    }

    @Override
    public String getControlValue() {
        return "Label";
    }
}
