package com.company.behavioral.patterns.memento.command;

import com.company.behavioral.patterns.memento.WorkflowDesigner;

public class RemoveStepCommand extends AbstractWorkflowCommand {

    private String step;

    public RemoveStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = designer.getMemento();
        this.designer.removeStep(step);
    }
}
