package com.company.behavioral.patterns.memento.command;

import com.company.behavioral.patterns.memento.WorkflowDesigner;

public class AddStepCommand extends AbstractWorkflowCommand {

    private String step;

    public AddStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = designer.getMemento();
        designer.addStep(step);
    }
}
