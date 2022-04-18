package com.company.behavioral.patterns.mediator;

public class Slider extends javafx.scene.control.Slider implements UIControl {

    private final UIMediator mediator;

    private boolean mediatedUpdate;

    public Slider(UIMediator mediator){

        this.mediator = mediator;
        setMin(0);
        setMax(50);
        setBlockIncrement(5);
        this.mediator.register(this);
        this.valueProperty().addListener((u,o,n) -> {
            if (!mediatedUpdate)
                this.mediator.valueChanged(this);
        });
    }

    @Override
    public void controlChanged(UIControl control) {
        mediatedUpdate = true;
        this.setValue(Double.valueOf(control.getControlValue()));
        mediatedUpdate = false;
    }

    @Override
    public String getControlName() {
        return "Slider";
    }

    @Override
    public String getControlValue() {
        return String.valueOf(this.getValue());
    }
}
